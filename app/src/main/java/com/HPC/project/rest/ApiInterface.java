package com.HPC.project.rest;



import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import snap.printo.Models.Hash;
import snap.printo.Models.HashResponse;
import snap.printo.Models.User;


public interface ApiInterface {

    @POST("/hash")
    Call<User> UserEmail(@Body User email);
    @POST("/order")
    Call<User> UserOrder(@Body User email);
}