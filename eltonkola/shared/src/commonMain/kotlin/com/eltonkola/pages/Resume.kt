package com.eltonkola.pages

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.eltonkola.components.*
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.Calendar
import com.eltonkola.components.icons.ekicon.Download
import com.eltonkola.components.icons.ekicon.Linkedin
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.ResumeRole
import com.eltonkola.data.URLS
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Resume() {
    Row(
        modifier = Modifier.fillMaxSize(),
    ) {

        Column(
            modifier = Modifier.fillMaxHeight().weight(0.35f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            EkCard(Modifier) {
                Image(
                    painter = painterResource(URLS.RESUME_URL),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(320.dp).height(460.dp),
                )
            }
            Spacer(modifier = Modifier.size(18.dp))

            val uriHandler = LocalUriHandler.current
            EkButton(
                onClick = {
                    uriHandler.openUri(URLS.DOWNLOAD_RESUME)
                },
                icon = EKIcon.Download,
                text = LocalContent.current.resume.downloadResume
            )

            Spacer(modifier = Modifier.size(8.dp))

            EkButton(
                onClick = {
                    uriHandler.openUri(URLS.PROFILE_LINKEDIN)
                },
                icon = EKIcon.Linkedin,
                text = LocalContent.current.resume.likedInProfile
            )

        }

        Column(
            modifier = Modifier.fillMaxHeight().weight(0.65f).padding(26.dp)
        ) {

            Text(
                text = LocalContent.current.resume.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(14.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.resume.body,
            )
            Spacer(modifier = Modifier.size(14.dp))


            Row(
                modifier = Modifier.fillMaxHeight().weight(0.65f)
            ) {


                val listState = rememberLazyListState()
                val coroutineScope = rememberCoroutineScope()
                val roles = LocalContent.current.resume.roles

                LazyColumn(
                    state = listState,
                    modifier = Modifier.weight(1f).fillMaxHeight()
                        .draggable(
                            orientation = Orientation.Vertical,
                            state = rememberDraggableState { delta ->
                                coroutineScope.launch {
                                    listState.scrollBy(-delta)
                                }
                            },
                        )

//                    .simpleVerticalScrollbar(listState)
                        //TODO - fix scroll on web
//                    .onPointerEvent(PointerEventType.Scroll) {
//                        number += it.changes.first().scrollDelta.y
//                    }
                        .padding(end = 8.dp)
                    ,
                ) {

                    items(roles) {
                        RoleRow(it)
                        Spacer(modifier = Modifier.size(8.dp))
                    }
                }


                VerticalScrollbar(
                    modifier = Modifier.width(8.dp).fillMaxHeight().background(Color.Gray.copy(alpha = 0.4f)),
                    adapter = rememberScrollbarAdapterZ(listState)
                )

            }

        }

    }
}



@Composable
fun ResumeMobile() {

        Column(
            modifier = Modifier.fillMaxSize().padding(26.dp),
        ) {

            Text(
                text = LocalContent.current.resume.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(14.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.resume.body,
            )
            Spacer(modifier = Modifier.size(14.dp))


            Row(
                modifier = Modifier.fillMaxHeight().weight(0.65f)
            ) {


                val listState = rememberLazyListState()
                val coroutineScope = rememberCoroutineScope()
                val roles = LocalContent.current.resume.roles

                LazyColumn(
                    state = listState,
                    modifier = Modifier.weight(1f).fillMaxHeight()
                        .draggable(
                            orientation = Orientation.Vertical,
                            state = rememberDraggableState { delta ->
                                coroutineScope.launch {
                                    listState.scrollBy(-delta)
                                }
                            },
                        )

//                    .simpleVerticalScrollbar(listState)
                        //TODO - fix scroll on web
//                    .onPointerEvent(PointerEventType.Scroll) {
//                        number += it.changes.first().scrollDelta.y
//                    }
                        .padding(end = 8.dp)
                    ,
                ) {

                    items(roles) {
                        RoleRow(it)
                        Spacer(modifier = Modifier.size(8.dp))
                    }


                    item {
                        val uriHandler = LocalUriHandler.current
                        EkButton(
                            onClick = {
                                uriHandler.openUri(URLS.DOWNLOAD_RESUME)
                            },
                            icon = EKIcon.Download,
                            text = LocalContent.current.resume.downloadResume
                        )

                        Spacer(modifier = Modifier.size(8.dp))

                        EkButton(
                            onClick = {
                                uriHandler.openUri(URLS.PROFILE_LINKEDIN)
                            },
                            icon = EKIcon.Linkedin,
                            text = LocalContent.current.resume.likedInProfile
                        )

                    }

                }


                VerticalScrollbar(
                    modifier = Modifier.width(8.dp).fillMaxHeight().background(Color.Gray.copy(alpha = 0.4f)),
                    adapter = rememberScrollbarAdapterZ(listState)
                )

            }

    }
}




@Composable
fun RoleRow(role: ResumeRole) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start)
    ) {
        Column(
            modifier = Modifier.weight(0.3f),
            horizontalAlignment = Alignment.End
        ) {
            Icon(imageVector = EKIcon.Calendar, contentDescription = null, modifier = Modifier.size(16.dp))
            Spacer(modifier = Modifier.size(2.dp))
            Text(
                style = EKTheme.typography().bodyTiny,
                text = role.startEndDate
            )
            Spacer(modifier = Modifier.size(4.dp))
            Text(
                style = EKTheme.typography().bodySmall,
                text = role.company,
            )
        }

        Spacer(
            modifier = Modifier.width(1.dp).height(120.dp).background(EKTheme.colors().secondary)
        )

        Column(
            modifier = Modifier.weight(0.7f),
        ) {
            Text(
                style = EKTheme.typography().bodySmall,
                text = role.role
            )
            Spacer(modifier = Modifier.size(8.dp))
            role.descriptionList.forEach { item ->
                Text(
                    style = EKTheme.typography().bodySmaller,
                    text = "- $item" ,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }

        }

    }
}

