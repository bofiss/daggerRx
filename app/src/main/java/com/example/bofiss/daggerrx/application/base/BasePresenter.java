package com.example.bofiss.daggerrx.application.base;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import rx.android.schedulers.AndroidSchedulers;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Belle on 03/05/2017.
 */

public class BasePresenter {

    protected <T> void subscribe(Observable<T> observable, Observer<T> observer){
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(A)
                .subscribe(observer);

    }
}
