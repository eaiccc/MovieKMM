package com.link.moviekmm.model.remote.ktor.response

import kotlinx.serialization.Serializable

@Serializable
data class MovieResponseItem(
    val results: List<MovieItem>,
    var page: Long,
    var total_pages: Long,
    var total_results: Long,
)

@Serializable
data class MovieItem(
    val id: Long,
    var adult: Boolean,
    var backdrop_path: String,
    var original_language:String,
    var original_title: String,
    var overview: String,
    var popularity: Double,
    val title: String,
    val poster_path: String,
    val release_date: String,
    val video: Boolean,
    val vote_average: Double,
    var vote_count: ULong,
)
