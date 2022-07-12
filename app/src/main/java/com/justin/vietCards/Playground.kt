package com.justin.vietCards

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun PreviewPlayground() {
    Playground()
}

@Composable
fun Playground() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1D9D9)),
        contentAlignment = Alignment.Center
    ) {
        StackOfCards {
            PlayingCard(rank = "2")
            PlayingCard(rank = "7")
            PlayingCard(rank = "Q")
            PlayingCard(rank = "A")
        }
    }
}