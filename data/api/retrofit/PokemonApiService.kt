package com.example.pokedex.data.api.retrofit

import com.example.pokedex.model.Pokemon
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiService {

    @GET("/pokemon")
    suspend fun getPokemon(): Response<Pokemon>
}