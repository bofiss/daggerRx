package com.example.bofiss.daggerrx.modules.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bofiss.daggerrx.R;
import com.example.bofiss.daggerrx.application.base.BaseActivity;
import com.example.bofiss.daggerrx.application.base.BasePresenter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

public class MainActivity extends BaseActivity {

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent){
        super.onViewReady(savedInstanceState, intent);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }
}
