package com.bignerdranch.android.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by mac on 2016/12/5.
 */

public class ThumbnailDownloader<T> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";
    public ThumbnailDownloader() {
        super(TAG);
    }
    public void queueThumbnail(T target, String url) {
        Log.i(TAG, "Got a URL: " + url + target.toString());
    }
}
