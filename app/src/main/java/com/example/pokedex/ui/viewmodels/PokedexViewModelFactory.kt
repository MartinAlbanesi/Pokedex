package com.example.pokedex.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pokedex.data.repositories.network.pokedex.PokedexClient
import com.example.pokedex.data.repositories.PokedexRepositoryImp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokedexViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val pokedexClient = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokedexClient::class.java)

        val pokedexRepository = PokedexRepositoryImp(pokedexClient)

        return PokedexViewModel(pokedexRepository) as T
    }
}