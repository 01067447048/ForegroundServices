package com.jaehyeon.basics.foregroundservices

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

/**
 * Created by jaehyeon.
 * Date: 5/16/24
 */
class RunningApp: Application() {

    override fun onCreate() {
        super.onCreate()

        val channel = NotificationChannel(
            "running_channel",
            "Running Notifications",
            NotificationManager.IMPORTANCE_HIGH
        )

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}