package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jetpack.compose.basic.ui.ui_component.DisplayTextView

@Composable
fun RowViewScreen() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        DisplayTextView(
            message = "First Item",
            style = TextStyle(color = Color.Red, fontSize = 18.sp)
        )
        DisplayTextView(
            message = "Second Item",
            style = TextStyle(color = Color.Black, fontSize = 18.sp)
        )
        DisplayTextView(
            message = "Third Item",
            style = TextStyle(color = Color.Blue, fontSize = 18.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RowViewScreenPreview() {
    RowViewScreen()
}

