package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jetpack.compose.basic.ui.ui_component.DisplayTextView

@Composable
fun SurfaceViewScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.DarkGray,
    ) {
        DisplayTextView(
            message = "Surface View",
            style = TextStyle(color = Color.White, fontSize = 20.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SurfaceViewScreenPreview() {
    SurfaceViewScreen()
}



