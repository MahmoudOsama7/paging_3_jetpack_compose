package com.example.paging3jetpackcompose.navigation

sealed class Screen(val route: String){
    data object Home: Screen("home_screen")
    data object Search: Screen("search_screen")
}