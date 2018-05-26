package com.nicolas_duponchel.parameterizedunittest

import com.google.common.truth.Truth.assert_
import com.nicolas_duponchel.parameterizedunittest.ERROR.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ErrorTranslatorParameterizedTest(
    private val errorCode: Int,
    private val error: ERROR
) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun errorCode() = listOf(
            arrayOf(22000, ANDROID),
            arrayOf(1890, ANDROID),
            arrayOf(404, NETWORK),
            arrayOf(1111,HUMAN),
            arrayOf(999,UNICORN),
            arrayOf(888,UNICORN),
            arrayOf(666,FIRE),
            arrayOf(123456,HOMER_SIMPSON),
            arrayOf(8, BANANA),
            arrayOf(0, UNKNOWN)
        )
    }

    @Test
    fun `toError returns good values`() =
        assert_().that(errorCode.toError()).isEqualTo(error)
}
