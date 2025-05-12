package com.ndipatri.gaggiakmpsimulator2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform