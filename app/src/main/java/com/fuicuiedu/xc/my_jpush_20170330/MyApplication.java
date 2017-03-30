package com.fuicuiedu.xc.my_jpush_20170330;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/3/30 0030.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //极光推送调试模式
        JPushInterface.setDebugMode(true);
        //极光推送初始化
        JPushInterface.init(this);
        
    }
}
