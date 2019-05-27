package com.lionel.retrofit2p.remote;

import com.lionel.retrofit2p.CouponListResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/api/v2/Coupon")
    Call<CouponListResult> getCouponList(@Body CouponListRequest couponListRequest);
}
