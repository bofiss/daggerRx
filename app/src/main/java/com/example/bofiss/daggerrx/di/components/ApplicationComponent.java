package com.example.bofiss.daggerrx.di.components;

import android.content.Context;
import android.support.test.espresso.core.deps.dagger.Component;

import com.example.bofiss.daggerrx.application.CakeApplication;
import com.example.bofiss.daggerrx.di.module.ApplicationModule;

import javax.inject.Singleton;

import retrofit2.Retrofit;

/**
 * Created by M on 03/05/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
   Retrofit exposeRetrofit();
    Context exposeContext();
}
