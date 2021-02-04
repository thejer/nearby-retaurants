package org.codejudge.android.utils

sealed class Result<out T : Any> {

    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val errorCode: String, val errorMessage: String) : Result<Nothing>()
}
