package com.eltonkola

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform