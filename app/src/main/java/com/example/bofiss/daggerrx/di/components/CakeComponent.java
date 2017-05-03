package com.example.bofiss.daggerrx.di.components;

import android.support.test.espresso.core.deps.dagger.Component;

import com.example.bofiss.daggerrx.di.module.CakeModule;

/**
 * Created by M on 03/05/2017.
 */
@Component(modules = CakeModule.class, dependencies = ApplicationComponent.class)
public interface CakeComponent {
}
