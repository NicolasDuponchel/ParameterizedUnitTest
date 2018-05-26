package com.nicolas_duponchel.parameterizedunittest

import com.nicolas_duponchel.parameterizedunittest.ERROR.*

enum class ERROR {
    ANDROID,
    NETWORK,
    HUMAN,
    UNICORN,
    FIRE,
    HOMER_SIMPSON,
    BANANA,
    UNKNOWN
}

fun Int.toError() = when (this) {
    22000, 1890 -> ANDROID
    404 -> NETWORK
    1111 -> HUMAN
    999, 888 -> UNICORN
    666 -> FIRE
    123456 -> HOMER_SIMPSON
    8 -> BANANA
    else -> UNKNOWN
}

