package com.example.practical7_20012011166

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val str1 = intent.getStringExtra("Service_1")
        if(str1 =="Start" || str1 == "Stop")
        {
            val intentService = Intent(context, AlarmService::class.java)
            intentService.putExtra("Service_1",intent.getStringExtra("Service_1"))
            if(str1 == "Start")
            {
                context.startService(intentService)
            }
            else if(str1 == "Stop")
            {
                context.stopService(intentService)
            }
        }
    }

}