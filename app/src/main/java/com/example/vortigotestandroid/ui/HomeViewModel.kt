package com.example.vortigotestandroid.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vortigotestandroid.model.User
import com.example.vortigotestandroid.repository.GithubRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// TODO (opcional): Completar a camada da ViewModel, realizando as chamadas necessárias
class HomeViewModel : ViewModel() {

    private val repository: GithubRepository = GithubRepository()

    private val _githubUser: MutableLiveData<User> = MutableLiveData()
    val githubUser: LiveData<User> = _githubUser

    init {
        loadGithubUser()
    }

    private fun loadGithubUser() {

        viewModelScope.launch {

            val response = withContext(Dispatchers.IO) {
                repository.getGithubUser()
            }

            if (response.isSuccessful) {
                _githubUser.value = response.body()
            }
        }
    }

}
