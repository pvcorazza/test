package com.example.vortigotestandroid.api

import com.example.vortigotestandroid.model.User
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



interface GithubApiService {

    // TODO: Recuperar as informações relativas ao seu usuário no Github através de uma chamada GET para "/users/{username}",
    //  onde username é o seu nome de usuário na plataforma. Opcionalmente, poderá realizar uma consulta para "/user/1024025"

    @GET("user/1024025")
    suspend fun getGithubUser():
            Response<User>
}