package com.example.pokedex.data.databse

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pokedex.data.local.PokemonDao
import com.example.pokedex.model.Pokemon

@Database(entities = [Log::class, Pokemon::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
    abstract fun pokemonDao(): PokemonDao
}