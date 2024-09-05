package com.example.autonapalarm.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class AlarmService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Handle alarm action
        Toast.makeText(this, "Alarm Triggered!", Toast.LENGTH_SHORT).show()
        return START_STICKY
    }
}
