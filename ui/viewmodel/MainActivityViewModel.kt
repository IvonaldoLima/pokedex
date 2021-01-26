package com.example.pokedex.ui.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.repository.PokemonRepository
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@ActivityScoped
class MainActivityViewModel  @ViewModelInject constructor(private val repository: PokemonRepository): ViewModel() {


    fun testViewModel(){
        Log.d("IPL", "Logando no view model")

        viewModelScope.launch(Dispatchers.IO) {
           //var pokemonResource = repository.getPokemon()
           var pokemon = repository.savePokemon()

            withContext(Dispatchers.Main) {
                    Log.d("IPL", "Pokemon inserido no banco: $pokemon")
            }
        }

    }


}