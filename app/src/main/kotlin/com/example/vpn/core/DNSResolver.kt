package com.example.vpn.core

import android.content.Context
import java.net.InetAddress
import java.net.UnknownHostException

class DNSResolver {
    // DNS resolution and filtering implementation
    private val TAG = "DNSResolver"

    fun resolveDomain(domain: String): InetAddress? {
        return try {
            InetAddress.getByName(domain)
        } catch (e: UnknownHostException) {
            null
        }
    }
}