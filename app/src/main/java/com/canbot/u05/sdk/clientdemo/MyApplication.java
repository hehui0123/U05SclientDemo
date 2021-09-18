package com.canbot.u05.sdk.clientdemo;

import android.app.Application;
import android.content.Context;
import com.canbot.u05.sdk.clientdemo.socket.ServerManager;

/**
 * Created by 110 on 2018/1/16.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;
        //初始化数据库相关
        ServerManager.getInstance().init(this);
    }
    public static Context getContext() {
        return mContext;
    }
}
