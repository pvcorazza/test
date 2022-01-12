package com.example.vortigotestandroid.repository

import com.example.vortigotestandroid.api.GithubApi
import com.example.vortigotestandroid.model.User
import retrofit2.Response

// TODO (opcional): Completar a interface do repositório

interface GithubRepository {

    suspend fun getGithubUser(): Response<User>

}