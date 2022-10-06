package com.example.alarmit.receivers


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import android.util.Log
import android.widget.Toast


class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("DEBUG----", "Working")
        Toast.makeText(context, "Alarm is supposed to ring", Toast.LENGTH_SHORT).show()

        //alarm is supposed to ring




    }
}