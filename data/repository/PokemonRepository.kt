package com.example.pokedex.data.repository

import com.example.pokedex.data.api.retrofit.PokemonApiService
import com.example.pokedex.data.local.PokemonDao
import com.example.pokedex.model.Pokemon
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepository @Inject constructor(
    private val pokemonServiceProvider: PokemonApiService,
    private val pokemonRepositoryProvider: PokemonDao
){

    suspend fun getPokemon(): Response<Pokemon> {
        return pokemonServiceProvider.getPokemon()
    }

    suspend fun savePokemon(): Long {
        return pokemonRepositoryProvider.insert(Pokemon(name = "Charizarde"))
    }
}