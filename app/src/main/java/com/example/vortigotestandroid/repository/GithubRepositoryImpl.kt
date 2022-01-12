package com.example.vortigotestandroid.repository

import com.example.vortigotestandroid.api.GithubApiService

// TODO (opcional): Completar a implementação do repositório, realizando as chamadas necessárias
class GithubRepositoryImpl(private val client: GithubApiService) : GithubRepository {

    override suspend fun getGithubUser() = client.getGithubUser()

}