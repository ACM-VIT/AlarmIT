package com.example.alarmit.models

import java.util.*

data class AlarmData(
    var time : Date,
    var state: Boolean,

    var mon: Boolean,
    var sun: Boolean,
)
