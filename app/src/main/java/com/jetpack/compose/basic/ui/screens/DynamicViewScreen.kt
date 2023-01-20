package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.compose.basic.ui.ui_component.DisplayButtonView
import com.jetpack.compose.basic.ui.ui_component.DisplayTextFieldView
import com.jetpack.compose.basic.ui.ui_component.DisplayTextView
import com.jetpack.compose.basic.utils.empty

@Composable
fun DynamicViewScreen() {
    val list = remember {
        mutableStateListOf<String>()
    }

    val text = remember {
        mutableStateOf(String.empty())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(10.dp))
        DisplayTextView(
            message = "Dynamic View",
            style = TextStyle(color = Color.White, fontSize = 24.sp)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        DisplayTextFieldView(text = text.value, color = Color.White) { newValue ->
            text.value = newValue as String
        }
        Spacer(modifier = Modifier.padding(5.dp))
        DisplayButtonView(width = 100.dp, text = "Add") { list.add(text.value) }
        Spacer(modifier = Modifier.padding(10.dp))
        DisplayTextView(message = "List :", style = TextStyle(color = Color.White, fontSize = 20.sp))
        Spacer(modifier = Modifier.padding(5.dp))
        DisplayList(list)
    }

}

@Composable
fun DisplayList(lists: List<String>) {
    for (item in lists) {
        Spacer(modifier = Modifier.padding(5.dp))
        DisplayTextView(
            message = item,
            style = TextStyle(color = Color.White, fontSize = 18.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DynamicViewScreenPreview() {
    DynamicViewScreen()
}