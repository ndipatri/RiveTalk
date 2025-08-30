package com.ndipatri.gaggiakmpsimulator2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.rive.runtime.kotlin.core.Rive

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }

        Rive.init(this)
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}