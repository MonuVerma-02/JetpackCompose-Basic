package com.jetpack.compose.basic.ui.ui_component

import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun DisplayTextFieldView(text: String, color: Color, newValue: (Any) -> Unit) {
    TextField(
        value = text,
        onValueChange = newValue,
        colors = TextFieldDefaults.textFieldColors(textColor = color)
    )
}