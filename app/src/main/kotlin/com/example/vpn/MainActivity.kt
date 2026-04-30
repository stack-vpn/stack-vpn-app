package com.example.vpn

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.example.vpn.ui.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("StackVPN") }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Welcome to StackVPN",
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { /* Handle connect */ }) {
                    Text("Connect")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { /* Handle settings */ }) {
                    Text("Settings")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { /* Handle profiles */ }) {
                    Text("Profiles")
                }
            }
        }
    }
}