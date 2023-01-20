package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jetpack.compose.basic.common.UserProfile
import com.jetpack.compose.basic.common.userProfileList
import com.jetpack.compose.basic.ui.ui_component.DisplayImageView
import com.jetpack.compose.basic.ui.ui_component.DisplayTextView

@Composable
fun LazyColumnViewScreen() {
    val list: ArrayList<UserProfile> = userProfileList

    LazyColumn {
        items(list) { userProfile ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                DisplayImageView(url = userProfile.pictureUrl)
                DisplayTextView(
                    message = userProfile.name,
                    style = TextStyle(color = Color.White, fontSize = 18.sp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LazyColumnViewScreenPreview() {
    LazyColumnViewScreen()
}