package com.justin.vietCards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Playground() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1D9D9))
        ,
        contentAlignment = Alignment.Center
    ) {
        SamplePlayingCard()
    }
}