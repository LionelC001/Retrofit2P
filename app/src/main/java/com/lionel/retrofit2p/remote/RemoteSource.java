package com.lionel.retrofit2p.remote;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteSource {

    private static final String DOMAIN = "https://jsonplaceholder.typicode.com/";

    private static final RemoteSource instance = new RemoteSource();
    private ApiService apiService;

    public RemoteSource() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(DOMAIN)
                .client(getOkHttpClient())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    private OkHttpClient getOkHttpClient(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
                .build();
        return client;
    }

    public static RemoteSource getInstance() {
        return instance;
    }

    public ApiService getApiService() {
        return apiService;
    }
}
