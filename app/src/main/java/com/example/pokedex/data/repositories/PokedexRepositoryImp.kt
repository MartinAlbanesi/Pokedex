package com.example.pokedex.data.repositories

import com.example.pokedex.data.repositories.models.Pokedex
import com.example.pokedex.data.repositories.network.pokedex.PokedexClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class PokedexRepositoryImp(private val pokedexClient: PokedexClient) : PokedexRepository {

    override suspend fun getPokedex(): Response<Pokedex> {
        return withContext(Dispatchers.IO) {
            pokedexClient.get()
        }
    }
}