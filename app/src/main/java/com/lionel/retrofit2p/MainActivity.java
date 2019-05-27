package com.lionel.retrofit2p;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.lionel.retrofit2p.remote.CouponListRequest;
import com.lionel.retrofit2p.remote.RemoteSource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRemoteSource();
    }

    private void initRemoteSource() {
        RemoteSource remoteSource = new RemoteSource();


        CouponListRequest request = new CouponListRequest();
        request.setToken("d9400375-e2e0-4410-8375-9c802d9c6621");

        remoteSource.getCouponList(request)
                .enqueue(new Callback<CouponListResult>() {
                    @Override
                    public void onResponse(Call<CouponListResult> call, Response<CouponListResult> response) {
                        Log.d("<>", "show");
                        Log.d("<>", new Gson().toJson(response.body()));
                    }

                    @Override
                    public void onFailure(Call<CouponListResult> call, Throwable throwable) {

                    }
                });
    }
}
