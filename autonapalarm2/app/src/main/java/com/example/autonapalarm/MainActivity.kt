package com.example.autonapalarm

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.autonapalarm.services.SleepMonitorService

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutonapAlarmTheme {
                // Starting sleep monitor service
                Intent(this, SleepMonitorService::class.java).also { intent ->
                    startService(intent)
                }
                // UI content here
            }
        }
    }
}
