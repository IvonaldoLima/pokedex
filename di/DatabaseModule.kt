package com.example.pokedex.di

import android.content.Context
import androidx.room.Room
import com.example.pokedex.data.databse.AppDatabase
import com.example.pokedex.data.databse.LogDao
import com.example.pokedex.data.local.PokemonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
                appContext,
                AppDatabase::class.java,
                "pokemon.db"
        ).build()
    }

    @Provides
    fun provideLogDao(database: AppDatabase): LogDao {
        return database.logDao()
    }

    @Provides
    fun providePokemonDao(appDatabase: AppDatabase): PokemonDao {
        return appDatabase.pokemonDao()
    }
}