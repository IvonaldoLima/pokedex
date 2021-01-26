package com.example.pokedex

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PokedexApplication: Application() {

    override fun onCreate(){
        super.onCreate()
        Log.d("IPL", "Iniciando aplicação")
    }
}