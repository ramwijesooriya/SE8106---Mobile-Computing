package com.example.practical2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // This calls your main screen
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    // This stacks everything vertically with 16dp space from the edge
    Column(modifier = Modifier.padding(16.dp)) {
        ProfileImage()
        ProfileTitle()
        ProfileDescription()
    }
}

@Composable
fun ProfileImage() {
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Profile Image",
        modifier = Modifier
            .padding(all = 16.dp)
            .size(size = 120.dp)
    )
}

@Composable
fun ProfileTitle() {
    Text(
        text = "John Doe",
        modifier = Modifier.padding(start = 16.dp)
    )
}

@Composable
fun ProfileDescription() {
    Text(
        text = "John Doe is a professional mobile app developer with expertise in Android.",
        modifier = Modifier.padding(all = 16.dp)
    )
}