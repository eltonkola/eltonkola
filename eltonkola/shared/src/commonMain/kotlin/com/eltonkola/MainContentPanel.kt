package com.eltonkola

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Card
import com.eltonkola.components.TransparentCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.eltonkola.model.Page
import com.eltonkola.model.UiState
import com.eltonkola.pages.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlinx.coroutines.launch
import rememberPagerState
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainContentPanel(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {
    TransparentCard(modifier = modifier) {

        val state = rememberPagerState()
        HorizontalPager(state = state, count = 5) { page ->
            Box(
                Modifier
                    .graphicsLayer {
                        // Calculate the absolute offset for the current page from the
                        // scroll position. We use the absolute value which allows us to mirror
                        // any effects for both directions
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                        // We animate the scaleX + scaleY, between 85% and 100%
                        lerp(
                            start = 0.85f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }

                        // We animate the alpha, between 50% and 100%
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
            ) {
                when (page) {
                    0 -> Home()
                    1 -> Resume()
                    2 -> Portfolio()
                    3 -> About()
                    4 -> Contact()
                }
            }
        }
        val scope = rememberCoroutineScope()

        LaunchedEffect(uiState.page){
            scope.launch {
                when (uiState.page) {
                    Page.Home -> state.animateScrollToPage(0)
                    Page.Resume -> state.animateScrollToPage(1)
                    Page.Portfolio -> state.animateScrollToPage(2)
                    Page.About -> state.animateScrollToPage(3)
                    Page.Contact -> state.animateScrollToPage(4)
                }
            }
        }

    }
}

fun lerp(start: Float, stop: Float, fraction: Float): Float {
    return (1 - fraction) * start + fraction * stop
}
