package com.example.mykmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyKmp",
    ) {
        App(
            batteryManager = BatteryManager()
        )
    }
}