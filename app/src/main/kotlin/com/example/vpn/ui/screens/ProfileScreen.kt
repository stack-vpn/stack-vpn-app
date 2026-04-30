package com.example.vpn.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    // Profile management screen implementation
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "VPN Profiles",
            style = MaterialTheme.typography.headlineMedium
        )

        // Profile list would go here
    }
}