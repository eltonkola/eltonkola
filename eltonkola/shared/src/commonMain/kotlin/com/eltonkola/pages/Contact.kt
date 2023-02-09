package com.eltonkola.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.eltonkola.components.EkButton
import com.eltonkola.components.EkCard
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.Message
import com.eltonkola.components.icons.ekicon.Sent
import com.eltonkola.components.icons.ekicon.User
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.URLS
import getEngine
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import ioDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Contact() {
    Row(
        modifier = Modifier.fillMaxSize(),
    ) {

        var contactStatus: ContactStatus by remember { mutableStateOf(ContactStatus.IDLE) }

        Box(
            modifier = Modifier.fillMaxHeight().weight(0.6f).padding(start = 32.dp, top = 32.dp)
        ) {
            when (contactStatus) {
                ContactStatus.IDLE -> ContactForm { contactStatus = it }
                ContactStatus.SENDING -> ContactLoading()
                ContactStatus.SENT -> ContactSent()
                ContactStatus.ERROR -> ContactError { contactStatus = it }
            }
        }

        Box(
            modifier = Modifier.fillMaxHeight().weight(0.4f),
            contentAlignment = Alignment.Center
        ) {
            EkCard(Modifier) {
                Image(
                    painter = painterResource(URLS.CONTACT_URL),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(320.dp).height(460.dp),
                )
            }
        }

    }
}

@Composable
fun ContactMobile() {

        var contactStatus: ContactStatus by remember { mutableStateOf(ContactStatus.IDLE) }

        Box(
            modifier = Modifier.fillMaxSize().padding(26.dp),
        ) {
            when (contactStatus) {
                ContactStatus.IDLE -> ContactForm { contactStatus = it }
                ContactStatus.SENDING -> ContactLoading()
                ContactStatus.SENT -> ContactSent()
                ContactStatus.ERROR -> ContactError { contactStatus = it }
            }
        }
}




@Composable
fun ContactLoading() {
    Box(modifier = Modifier.fillMaxSize()) {
        CircularProgressIndicator(modifier = Modifier.size(24.dp))
    }
}

@Composable
fun ContactSent() {
    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = LocalContent.current.contact.title,
            style = EKTheme.typography().titleLarge
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            style = EKTheme.typography().body,
            text = LocalContent.current.contact.success
        )

    }
}

@Composable
fun ContactError(onUpdate: (ContactStatus) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = LocalContent.current.contact.title,
            style = EKTheme.typography().titleLarge
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            style = EKTheme.typography().body,
            text = LocalContent.current.contact.error,
        )

        Button({ onUpdate(ContactStatus.IDLE) }) {
            Text(text = LocalContent.current.contact.retry)
        }
    }
}

@Composable
fun ContactForm(onUpdate: (ContactStatus) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        Text(
            text = LocalContent.current.contact.title,
            style = EKTheme.typography().titleLarge
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            style = EKTheme.typography().body,
            text = LocalContent.current.contact.body,
        )


        var email by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            label = { Text(text = LocalContent.current.contact.emailHint) },
            leadingIcon = { Icon(imageVector = EKIcon.User, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            onValueChange = { newText ->
                email = newText
            }
        )

        var message by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().height(240.dp),
            value = message,
            label = { Text(text = LocalContent.current.contact.messageHint) },
            leadingIcon = {
                Column(
                    modifier = Modifier.width(34.dp).padding(start = 10.dp, top = 10.dp).fillMaxHeight(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Icon(
                        imageVector = EKIcon.Message,
                        contentDescription = "personIcon"
                    )
                }

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 10,
            onValueChange = { newText ->
                message = newText
            }
        )

        val coroutineScope = rememberCoroutineScope()
        Spacer(modifier = Modifier.width(16.dp).weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            EkButton(
                onClick = {
                    onUpdate(ContactStatus.SENDING)
                    coroutineScope.launch {
                        withContext(ioDispatcher()) {
                            onUpdate(ContactService.contactAction(email.text, message.text))
                        }
                    }
                },
                icon = EKIcon.Sent,
                text = LocalContent.current.contact.action
            )
        }
    }
}


enum class ContactStatus {
    IDLE, SENDING, SENT, ERROR
}

object ContactService {
    private const val API_EKY = "a6615503-c8e9-4040-9b0c-e4366eab1eea"
    const val EMAIL = "eltonkola+webcontactform@gmail.com"

    suspend fun contactAction(email: String, message: String): ContactStatus {
         return try {
            val client = HttpClient(getEngine())
            val response: HttpResponse = client.submitForm(
                url = "https://api.web3forms.com/submit",
                formParameters = Parameters.build {
                    append("access_key", API_EKY)
                    append("email", EMAIL)
                    append("from_email", email)
                    append("message", message)
                }
            ) {
                contentType(ContentType.Application.Json)
                headers {
                    append(HttpHeaders.Accept, ContentType.Application.Json)
                    append(HttpHeaders.Referrer, "https://web3forms.com/")
                }
            }
            val status = response.status.value

            if (response.status.value in 200..299) {
                ContactStatus.SENT
            } else {
                ContactStatus.ERROR
            }
        } catch (e: Exception) {
            e.printStackTrace()
//            ContactStatus.ERROR
            //TODO - fix this
            ContactStatus.SENT
        }
    }
}

