package com.example.vortigotestandroid.di

import com.example.vortigotestandroid.api.GithubApiService
import com.example.vortigotestandroid.repository.GithubRepository
import com.example.vortigotestandroid.repository.GithubRepositoryImpl
import com.example.vortigotestandroid.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.github.com/"

// TODO (opcional): Declarar todos os modulos necessários para o Koin
val appModule = module {

    single< GithubApiService> { Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build().create(GithubApiService::class.java) }
    single<GithubRepository> { GithubRepositoryImpl(get()) }
    viewModel { HomeViewModel(get()) }


}