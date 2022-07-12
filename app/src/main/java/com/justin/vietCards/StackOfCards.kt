package com.justin.vietCards

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PreviewStackOfCards() {
    StackOfCards {
        PlayingCard(rank = "2")
        PlayingCard(rank = "7")
        PlayingCard(rank = "Q")
        PlayingCard(rank = "A")
    }
}

@Composable
fun StackOfCards(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    /**
     * TODO: Pass in "content" composable, like a Row or Column does
     * TODO: For each card, place it relative to an xPosition (previous xPosition + previous card's width / 2)
     */
    Layout(
        modifier = modifier,
        content = content
    ) { measurables, constraints ->
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }

        layout(
            width = constraints.maxWidth,
            height = constraints.maxHeight
        ) {
            var xPosition = 0

            placeables.forEach { placeable ->
                placeable.placeRelative(
                    x = xPosition,
                    y = 0
                )

                xPosition += (placeable.width) / 2
            }
        }
    }
}