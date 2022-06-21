package com.example.fragmentthursday.common
import com.example.fragmentthursday.Interface.RetrofitServieces
import com.example.fragmentthursday.retrofit.RetrofitClient


object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServieces
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServieces::class.java)
}