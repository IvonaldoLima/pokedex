package com.example.pokedex.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon")
data class Pokemon(@PrimaryKey(autoGenerate = true)
                   var id: Long = 0,
                   val name: String)