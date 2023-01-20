package com.jetpack.compose.basic.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen(route = "MainScreen")
    object Surface : Screen(route = "Surface")
    object Column : Screen(route = "Column")
    object Row : Screen(route = "Row")
    object StaticView : Screen(route = "StaticView")
    object DynamicView : Screen(route = "DynamicView")
    object LazyColumnView : Screen(route = "LazyColumnView")
    object LazyRowView : Screen(route = "LazyRowView")
}