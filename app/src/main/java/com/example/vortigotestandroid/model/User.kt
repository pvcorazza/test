package com.example.vortigotestandroid.model

import com.google.gson.annotations.SerializedName

// TODO: Criar um modelo para recuperar os dados do usuário baseado no JSON da url: https://api.github.com/user/1024025

//{
//    "login": "mojombo",
//    "avatar_url": "https://avatars.githubusercontent.com/u/1?v=4",
//    "name": "Tom Preston-Werner",
//    "public_repos": 63,
//    "followers": 22808,
//    "following": 11,
//}

data class User (
    @SerializedName("login")
    val login: String?,
    @SerializedName("avatar_url")
    val avatarURL: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("public_repos")
    val publicRepos: Int?,
    @SerializedName("followers")
    val followers: Int?,
    @SerializedName("following")
    val following: Int?,
)