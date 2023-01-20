package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.compose.basic.ui.ui_component.DisplayTextView

@Composable
fun StaticViewScreen() {
    val lists = mutableListOf("RAM", "RAMA", "RAMAYA", "RAMAYAN")
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(7.dp))
        DisplayTextView(
            message = "Static View",
            style = TextStyle(color = Color.White, fontSize = 24.sp)
        )
        Spacer(modifier = Modifier.padding(7.dp))
        for (item in lists) {
            DisplayTextView(
                message = item,
                style = TextStyle(color = Color.Red, fontSize = 18.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StaticViewScreenPreview() {
    StaticViewScreen()
}