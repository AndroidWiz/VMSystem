package org.marssquad.vmsys

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform