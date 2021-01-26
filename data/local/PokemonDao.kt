package com.example.pokedex.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pokedex.model.Pokemon

@Dao
interface PokemonDao {

    @Query("SELECT * FROM pokemon")
    suspend fun getAllPokemons() : List<Pokemon>

    @Query("SELECT * FROM pokemon WHERE id = :id")
    suspend fun getPokemon(id: Int): Pokemon

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<Pokemon>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Pokemon) : Long
}