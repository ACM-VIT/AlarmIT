package com.example.alarmit.models

import java.util.*

data class AlarmData(
    var time : Date,
    var state: Boolean,

    var sun: Boolean,
    var mon: Boolean,
    var tue: Boolean,
    var wed: Boolean,
    var thu: Boolean,
    var fri: Boolean,
    var sat: Boolean

)
