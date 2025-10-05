package com.example.mykmp

import platform.UIKit.UIDevice
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun batteryManager(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        return (batteryLevel * 100).roundToInt()
    }
}