package com.example.pokedex.data.repositories

import com.example.pokedex.data.repositories.models.Pokedex
import retrofit2.Response

interface PokedexRepository {

    suspend fun getPokedex() : Response<Pokedex>
}