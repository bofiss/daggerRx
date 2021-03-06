package com.example.bofiss.daggerrx.application.base;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by M on 03/05/2017.
 */


//base class for all sub activity
public abstract class BaseActivity extends AppCompatActivity{
    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        onViewReady(savedInstanceState, getIntent());
    }

    protected abstract int getContentView();

    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
    }



    protected void showDialog(String message) {
       if (mProgressDialog == null) {
           mProgressDialog = new ProgressDialog(this);
           mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
           mProgressDialog.setCancelable(true);
       }

        mProgressDialog.setMessage(message);
        mProgressDialog.show();
    }

    protected void  hideDialog() {
        if(mProgressDialog != null && mProgressDialog.isShowing()){
            mProgressDialog.dismiss();
        }
    }
}
