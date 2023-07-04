package com.example.wechatlogindemo;

import android.app.Application;

import com.example.wechatlogindemo.wxapi.WxLogin;

public class MyApplication extends Application {
 
    @Override
    public void onCreate() {
        super.onCreate();
        WxLogin.initWx(this);
    }
}