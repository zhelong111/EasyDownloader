package com.brucezhou.downloadlibrary;

import android.content.Context;

public class EasyDownloader {
    private static Context context;

    public static void init(Context context) {
        EasyDownloader.context = context;
    }


    public static Context getContext() {
        return context;
    }
}
