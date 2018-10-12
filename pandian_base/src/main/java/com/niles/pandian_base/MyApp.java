package com.niles.pandian_base;

import android.app.Application;

/**
 * Created by Niles
 * Date 2018/10/12 15:32
 * Email niulinguo@163.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PanDianAppManager.init(this, BuildConfig.DEBUG);
    }
}
