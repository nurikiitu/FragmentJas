package com.example.fragmentthursday.Interface


import com.example.fragmentthursday.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServieces{
    @GET("marvel")
    fun getMovieList() : Call<MutableList<Movie>>
}