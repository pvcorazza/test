package com.example.vortigotestandroid.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.github.com/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object GithubApi {
    val retrofitService: GithubApiService by lazy {
        retrofit.create(GithubApiService::class.java)
    }
}

interface GithubApiService {

    // TODO: Recuperar as informações relativas ao seu usuário no Github através de uma chamada GET para "/users/{username}",
    //  onde username é o seu nome de usuário na plataforma. Opcionalmente, poderá realizar uma consulta para "/user/1024025"

}