package com.example.vortigotestandroid.repository

import com.example.vortigotestandroid.api.GithubApi

// TODO (opcional): Completar a camada do repositório, realizando as chamadas necessárias
class GithubRepository {

    private val client = GithubApi.retrofitService

    suspend fun getGithubUser() = client.getGithubUser()

}