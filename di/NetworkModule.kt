package com.example.pokedex.di

import com.example.pokedex.data.api.retrofit.PokemonApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object NetworkModule{

    @Provides
    @Singleton
    fun provideAuthInterceptorOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("http://demo1139027.mockable.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun providePokemonService(retrofit: Retrofit): PokemonApiService = retrofit.create(PokemonApiService::class.java)
}