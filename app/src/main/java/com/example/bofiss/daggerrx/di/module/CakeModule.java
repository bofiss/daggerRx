package com.example.bofiss.daggerrx.di.module;

import android.support.test.espresso.core.deps.dagger.Component;
import android.support.test.espresso.core.deps.dagger.Module;
import android.support.test.espresso.core.deps.dagger.Provides;

import com.example.bofiss.daggerrx.api.CakeApiService;
import com.example.bofiss.daggerrx.di.components.ApplicationComponent;

import retrofit2.Retrofit;

/**
 * Created by M on 03/05/2017.
 */


@Module
public class CakeModule {
    @PerActivity
    @Provides
    CakeApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(CakeApiService.class);
    }

}
