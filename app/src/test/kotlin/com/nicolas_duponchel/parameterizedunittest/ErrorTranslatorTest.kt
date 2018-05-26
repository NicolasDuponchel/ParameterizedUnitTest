package com.nicolas_duponchel.parameterizedunittest

import com.google.common.truth.Truth
import com.nicolas_duponchel.parameterizedunittest.ERROR.*
import org.junit.Test

class ErrorTranslatorTest {

    @Test
    fun `toError returns ANDROID if code is 22000`() {
        Truth.assert_()
            .that(22000.toError())
            .isEqualTo(ANDROID)
    }

    @Test
    fun `toError returns ANDROID if code is 1890`() {
        val errorCode = 1890
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(ANDROID)
    }

    @Test
    fun `toError returns NETWORK if code is 404`() {
        val errorCode = 404
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(NETWORK)
    }

    @Test
    fun `toError returns HUMAN if code is 1111`() {
        val errorCode = 1111
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(HUMAN)
    }

    @Test
    fun `toError returns UNICORN if code is 999`() {
        val errorCode = 999
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNICORN)
    }

    @Test
    fun `toError returns UNICORN if code is 888`() {
        val errorCode = 888
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNICORN)
    }

    @Test
    fun `toError returns FIRE if code is 666`() {
        val errorCode = 666
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(FIRE)
    }

    @Test
    fun `toError returns HOMER_SIMPSON if code is 123456`() {
        val errorCode = 123456
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(HOMER_SIMPSON)
    }

    @Test
    fun `toError returns BANANA if code is 8`() {
        val errorCode = 8
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(BANANA)
    }

    @Test
    fun `toError returns UNKNOW if code is 1`() {
        val errorCode = 1
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 2`() {
        val errorCode = 2
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 3`() {
        val errorCode = 3
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 4`() {
        val errorCode = 4
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 5`() {
        val errorCode = 5
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 6`() {
        val errorCode = 6
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 7`() {
        val errorCode = 7
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 9`() {
        val errorCode = 9
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 10`() {
        val errorCode = 10
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 11`() {
        val errorCode = 11
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }

    @Test
    fun `toError returns UNKNOW if code is 12`() {
        val errorCode = 12
        val error = errorCode.toError()
        Truth.assert_()
            .that(error)
            .isEqualTo(UNKNOWN)
    }
}