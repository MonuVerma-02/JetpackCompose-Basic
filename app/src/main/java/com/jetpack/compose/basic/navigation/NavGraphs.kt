package com.jetpack.compose.basic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jetpack.compose.basic.ui.screens.*

@Composable
fun NavGraphs(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(
            route = Screen.MainScreen.route
        ) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.Surface.route
        ) {
            SurfaceViewScreen()
        }
        composable(
            route = Screen.Column.route
        ) {
            ColumnViewScreen()
        }
        composable(
            route = Screen.Row.route
        ) {
            RowViewScreen()
        }
        composable(
            route = Screen.StaticView.route
        ) {
            StaticViewScreen()
        }
        composable(
            route = Screen.DynamicView.route
        ) {
            DynamicViewScreen()
        }
        composable(
            route = Screen.LazyColumnView.route
        ) {
            LazyColumnViewScreen()
        }
        composable(
            route = Screen.LazyRowView.route
        ) {
            LazyRowViewScreen()
        }
    }
}