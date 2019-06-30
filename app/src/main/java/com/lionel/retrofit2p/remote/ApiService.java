package com.lionel.retrofit2p.remote;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/albums/{id}")
    Call<AlbumResponse> getAlbum(@Path("id") String id);

    @POST("/albums")
    Call<AlbumResponse> postAlbum(@Body AlbumRequest request);
}
