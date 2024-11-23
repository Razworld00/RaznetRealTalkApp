package com.example.raznetrealtalkapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun GreetingScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello, welcome to Raznet RealTalk App!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("chat") }) {
            Text(text = "Go to Chat")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("profile") }) {
            Text(text = "Go to Profile")
        }
    }
}
