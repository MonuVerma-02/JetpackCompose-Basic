package com.jetpack.compose.basic.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jetpack.compose.basic.navigation.Screen
import com.jetpack.compose.basic.ui.ui_component.DisplayButtonView

@Composable
fun MainScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.DarkGray
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DisplayButtonView(
                width = 250.dp,
                text = "Surface"
            ) {
                navController.navigate(Screen.Surface.route)
            }

            DisplayButtonView(
                width = 250.dp,
                text = "Column"
            ) {
                navController.navigate(Screen.Column.route)
            }
            DisplayButtonView(
                width = 250.dp,
                text = "Row"
            ) {
                navController.navigate(Screen.Row.route)
            }
            DisplayButtonView(
                width = 250.dp,
                text = "Static View"
            ) {
                navController.navigate(Screen.StaticView.route)
            }
            DisplayButtonView(
                width = 250.dp,
                text = "Dynamic View"
            ) {
                navController.navigate(Screen.DynamicView.route)
            }
            DisplayButtonView(
                width = 250.dp,
                text = "Lazy Column"
            ) {
                navController.navigate(Screen.LazyColumnView.route)
            }
            DisplayButtonView(
                width = 250.dp,
                text = "Lazy Row"
            ) {
                navController.navigate(Screen.LazyRowView.route)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController = navController)
}
