package com.example.pokedex.util

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DateFormatter @Inject constructor(){
    private val formatter = SimpleDateFormat("d MMM yyyy HH:mm:ss")

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}