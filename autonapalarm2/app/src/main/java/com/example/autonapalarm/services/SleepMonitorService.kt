package com.example.autonapalarm.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.autonapalarm.utils.HealthMonitor

class SleepMonitorService : Service() {
    private val healthMonitor = HealthMonitor()

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Start monitoring health data (sleep & heart rate)
        healthMonitor.startMonitoring()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        healthMonitor.stopMonitoring()
    }
}
