package com.niles.pandian_base;

import android.app.Application;
import android.util.Log;

import com.niles.http.HttpConfig;
import com.niles.http.HttpManager;
import com.niles.http.converter.StringConverterFactory;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Niles
 * Date 2018/10/12 15:34
 * Email niulinguo@163.com
 */
public class PanDianAppManager {

    private static final String TAG = "PanDian";

    private static PanDianAppManager sInstance;
    private final HttpManager mHttpManager = new HttpManager();

    private final boolean mIsDebug;
    private final Application mApp;

    private PanDianAppManager(Application app, final boolean isDebug) {
        mApp = app;
        mIsDebug = isDebug;
        mHttpManager.setHttpConfig(new HttpConfig.Builder()
                .setLogger(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(String message) {
                        if (isDebug) {
                            Log.e(TAG, message);
                        }
                    }
                })
                .addConverterFactory(StringConverterFactory.create())
                .build());
    }

    public static void init(Application app, boolean isDebug) {
        if (sInstance != null) {
            throw new RuntimeException("Init Once");
        }
        sInstance = new PanDianAppManager(app, isDebug);
    }

    public static PanDianAppManager getInstance() {
        if (sInstance == null) {
            throw new RuntimeException("Init First");
        }
        return sInstance;
    }

    public HttpManager getHttpManager() {
        return mHttpManager;
    }

    public Application getApp() {
        return mApp;
    }

    public boolean isDebug() {
        return mIsDebug;
    }
}
