package com.mikhaellopez.domain.model

data class Repo(
    val id: Long,
    val name: String,
    val description: String? = null,
    val url: String,
    val isFavorite: Boolean,
    val userName: String
)