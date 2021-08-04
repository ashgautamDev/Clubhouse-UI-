package com.example.clubhouseuiclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.clubhouseuiclone.screen.HomeScreen
import com.example.clubhouseuiclone.ui.theme.ClubhouseUiCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClubhouseUiCloneTheme {
                HomeScreen()
            }
        }
    }
}


