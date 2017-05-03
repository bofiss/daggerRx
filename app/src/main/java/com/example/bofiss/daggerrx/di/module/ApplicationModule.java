package com.example.bofiss.daggerrx.di.module;

import android.content.Context;
import android.support.test.espresso.core.deps.dagger.Module;
import android.support.test.espresso.core.deps.dagger.Provides;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by M on 03/05/2017.
 */

@Module
public class ApplicationModule {
    private String mBaseUrl;
    private Context mContext;


    public ApplicationModule(Context context  , String baseUrl ){
        mBaseUrl = baseUrl;
        mContext = context;
    }

    @Singleton
    @Provides
    @Named("ok-1")
    OkHttpClient provideOkHttpClient1() {

        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    @Named("ok-2")
    OkHttpClient provideOkHttpClient2() {

        return new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }




    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory() {
        GsonConverterFactory factory = GsonConverterFactory.create();
        return factory;

    }

    @Singleton
    @Provides
    RxJavaCallAdapterFactory provideRxJavaCallAdapterFactory() {
        RxJavaCallAdapterFactory adapterFactory = RxJavaCallAdapterFactory.create();
        return adapterFactory;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mContext;
    }


    @Singleton
    @Provides
    Retrofit provideRetrofit(@Named("ok-1'") OkHttpClient client, GsonConverterFactory converterFactory,
    RxJavaCallAdapterFactory adapterFactory) {
        GsonConverterFactory factory = GsonConverterFactory.create();
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .build();
    }
}
