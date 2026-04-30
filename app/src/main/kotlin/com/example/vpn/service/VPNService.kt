package com.example.vpn.service

import android.net.VpnService
import android.content.Intent
import android.net.VpnService.Builder
import android.os.ParcelFileDescriptor
import android.util.Log
import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress

class VPNService : VpnService() {
    private val TAG = "StackVPNService"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "VPN Service created")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "VPN Service destroyed")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}