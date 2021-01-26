package com.example.pokedex.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PokemonDetailsActivityViewModel: ViewModel() {

    class PokemonDetailsActivityViewModelFactory(): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PokemonDetailsActivityViewModel::class.java)){
                return PokemonDetailsActivityViewModel() as T
            }
            throw IllegalArgumentException("Unknown class name")
        }
    }
}