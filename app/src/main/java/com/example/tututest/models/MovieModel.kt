package com.example.tututest.models

import java.io.Serializable

data class MovieModel(
    val docs: List<Doc>,
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
) : Serializable