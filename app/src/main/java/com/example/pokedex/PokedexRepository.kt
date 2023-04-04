package com.example.pokedex

import com.example.pokedex.Pokedex
import retrofit2.Response

interface PokedexRepository {

    suspend fun getPokedex() : Response<Pokedex>
}