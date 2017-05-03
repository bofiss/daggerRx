package com.example.bofiss.daggerrx.api;



import com.example.bofiss.daggerrx.mvp.model.CakeResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;



/**
 * Created by M on 03/05/2017.
 */

public interface CakeApiService {

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakeResponse> getCakes();

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Call<CakeResponse> getTheCakes();

}
