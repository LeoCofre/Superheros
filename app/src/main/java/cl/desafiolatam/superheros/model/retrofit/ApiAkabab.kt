package com.example.superheroeskvh.model.retrofit

import cl.desafiolatam.superheros.model.dataClass.Superhero


import retrofit2.http.GET

//__________Endpoints para obtener los superheroes________
interface ApiAkabab {

    @GET("all.json")
    suspend fun getAllSuperheroesFromApi():List<Superhero>
}