package com.example.pokedex.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedex.R
import com.example.pokedex.databinding.ActivityMainBinding
import com.example.pokedex.ui.viewmodel.MainActivityViewModel
import com.example.pokedex.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val exampleViewModel by viewModels<MainActivityViewModel>()
    @Inject lateinit var dateFormatter: DateFormatter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        button()
    }
    private fun button(){
        Log.d("IPL", "Load button")
        binding.buttonMainPage.setOnClickListener {
          //  Log.d("IPL", "Botão clicado")
           // val tsLong = System.currentTimeMillis() / 1000
           // val dataFormatada = dateFormatter.formatDate(timestamp = tsLong)
           // Toast.makeText(applicationContext, "Data formatada: $dataFormatada", Toast.LENGTH_SHORT).show()
           exampleViewModel.testViewModel()
        }
    }
}