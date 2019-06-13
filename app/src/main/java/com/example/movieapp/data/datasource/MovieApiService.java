package com.example.movieapp.data.datasource;

import com.example.movieapp.data.models.Movies;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface MovieApiService {

    @GET("/3/discover/movie?")
    Call<Movies> getMoviesFromYear(@QueryMap Map<String, String> options);
}
