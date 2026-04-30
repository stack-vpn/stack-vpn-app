package com.example.vpn.utils

import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.os.Build

class SplitTunneling {
    // Split tunneling implementation
    private val TAG = "SplitTunneling"

    fun isAppExcluded(packageName: String): Boolean {
        // Implementation for checking if an app is excluded from VPN
        return false
    }

    fun excludeApp(packageName: String) {
        // Implementation for excluding an app from VPN routing
    }

    fun includeApp(packageName: String) {
        // Implementation for including an app in VPN routing
    }
}