package com.lionel.retrofit2p;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.gson.Gson;
import com.lionel.retrofit2p.databinding.ActivityMainBinding;
import com.lionel.retrofit2p.remote.AlbumRequest;
import com.lionel.retrofit2p.remote.AlbumResponse;
import com.lionel.retrofit2p.remote.ApiService;
import com.lionel.retrofit2p.remote.RemoteSource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiService apiService;
    private ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        apiService = RemoteSource.getInstance().getApiService();
    }

    public void onGetBtnClicked(View view) {
        apiService.getAlbum("3").enqueue(new Callback<AlbumResponse>() {
            @Override
            public void onResponse(Call<AlbumResponse> call, Response<AlbumResponse> response) {
                if (response.body() != null) {
                    dataBinding.setData(new Gson().toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<AlbumResponse> call, Throwable t) {

            }
        });
    }

    public void onPostBtnClicked(View view) {
        AlbumRequest albumRequest = new AlbumRequest();
        albumRequest.setId(99);
        albumRequest.setTitle("999");
        albumRequest.setUserId(888);

        apiService.postAlbum(albumRequest).enqueue(new Callback<AlbumResponse>() {
            @Override
            public void onResponse(Call<AlbumResponse> call, Response<AlbumResponse> response) {
                if (response.body() != null) {
                    dataBinding.setData(new Gson().toJson(response.body()));
                }
            }
            @Override
            public void onFailure(Call<AlbumResponse> call, Throwable t) {

            }
        });
    }
}
