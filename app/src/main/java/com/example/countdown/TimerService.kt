package com.example.countdown

import android.app.Service
import android.content.Intent
import android.os.CountDownTimer
import android.os.IBinder
import android.util.Log

class TimerService : Service() {
    val intent = Intent()
    lateinit var timer: CountDownTimer

    override fun onCreate() {
        super.onCreate()
        Log.d("onCreate", "Timer starts")

        timer = object: CountDownTimer(30000, 1000) {
            override fun onTick(p0: Long) {
                TODO("Not yet implemented")
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }
        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}