package com.lzm.sqlitedemo;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * 整个程序定制的Application对象。
 */
public class OrderApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //在应用程序启动时，初始化Stetho后，可以在chrome浏览器调试APP，通过chrome://inspect/#devices访问
        Stetho.initializeWithDefaults(this);
        if (!OrderContext.isInitialized()) {
            OrderContext.init(getApplicationContext());
        }
    }
}
