package com.example.vortigotestandroid.repository

import com.example.vortigotestandroid.api.GithubApi

// TODO (opcional): Completar a implementação do repositório, realizando as chamadas necessárias
class GithubRepositoryImpl : GithubRepository {
    private val client = GithubApi.retrofitService

    override suspend fun getGithubUser() = client.getGithubUser()

}