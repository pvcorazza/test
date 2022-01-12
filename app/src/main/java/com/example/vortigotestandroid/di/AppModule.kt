package com.example.vortigotestandroid.di

import com.example.vortigotestandroid.repository.GithubRepository
import com.example.vortigotestandroid.repository.GithubRepositoryImpl
import com.example.vortigotestandroid.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// TODO (opcional): Declarar todos os modulos necessários para o Koin
val appModule = module {

    single<GithubRepository> { GithubRepositoryImpl() }
    viewModel { HomeViewModel(get()) }

}