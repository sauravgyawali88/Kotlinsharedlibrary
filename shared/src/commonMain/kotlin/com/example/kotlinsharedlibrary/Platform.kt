package com.example.kotlinsharedlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform