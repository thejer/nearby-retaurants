package org.codejudge.android.utils

import retrofit2.Response

const val GENERIC_ERROR_MESSAGE = "An error occurred, Please try again"
const val GENERIC_ERROR_CODE = "-1"

fun <T : Any> getAPIResult(response: Response<T>): Result<T> {
    if (response.isSuccessful) {
        response.body()?.let {
            return Result.Success(it)
        }
    } else {
        response.errorBody()?.let {
            return Result.Error(
                    GENERIC_ERROR_CODE, GENERIC_ERROR_MESSAGE
            )
        }
    }
    // Fallback to regular status code and message
    return Result.Error("${response.code()}", response.message())
}

