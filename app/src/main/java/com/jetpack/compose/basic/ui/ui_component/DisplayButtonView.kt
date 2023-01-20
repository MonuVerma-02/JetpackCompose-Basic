package com.jetpack.compose.basic.ui.ui_component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DisplayButtonView(width: Dp, text: String, buttonClick: () -> Unit) {
    Button(
        modifier = Modifier
            .width(width)
            .padding(all = 5.dp),
        onClick = buttonClick
    ) {
        Text(text = text)
    }
}