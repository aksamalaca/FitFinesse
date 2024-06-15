package com.example.fitfinessee.JadwalWoPage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;

public class AppController extends Application implements ComponentCallbacks2 {

    private static AppController mInstance;

    public static synchronized AppController getInstance() {
        return mInstance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}

