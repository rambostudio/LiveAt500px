package com.example.rambo.liveat500px.manager.http;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by rambo on 27/3/2560.
 */

public interface ApiService {

    @POST("list")
    Call<Object> loadPhotoList();

}

