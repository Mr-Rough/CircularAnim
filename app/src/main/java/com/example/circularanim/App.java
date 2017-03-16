package com.example.circularanim;

import android.app.Application;

/**
 * 创建日期：2017/3/16 on 21:26
 * 描述:
 * 作者:王小智 Administrator
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CircularAnim.init(700, 500, R.color.colorPrimary);
    }
}
