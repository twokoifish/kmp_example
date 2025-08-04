package me.ajanuszko.kmp_example

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform