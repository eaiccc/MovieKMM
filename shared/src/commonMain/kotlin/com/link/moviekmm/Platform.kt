package com.link.moviekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform