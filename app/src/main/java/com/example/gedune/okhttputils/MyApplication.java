package com.example.gedune.okhttputils;

import android.app.Application;

/**
 * Created by zw on 16/8/4.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppProfile.init(this);
    }

}
