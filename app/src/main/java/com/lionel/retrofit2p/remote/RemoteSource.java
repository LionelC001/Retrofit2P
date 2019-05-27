package com.lionel.retrofit2p.remote;

import com.lionel.retrofit2p.CouponListResult;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteSource {

    private final Retrofit retrofit;
    private final ApiService apiService;

    public RemoteSource() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://60.250.92.20:8082")
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public Call<CouponListResult> getCouponList(CouponListRequest couponListRequest) {
        return apiService.getCouponList(couponListRequest);
    }
}
