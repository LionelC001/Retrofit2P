package com.lionel.retrofit2p.remote;

import com.google.gson.annotations.SerializedName;

public class CouponListRequest {
    @SerializedName("v7idea_Token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
