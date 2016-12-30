package com.liskovsoft.browser;

import android.app.Application;
import android.webkit.CookieSyncManager;
import com.liskovsoft.browser.util.SimpleUncaughtExceptionHandler;

import java.lang.Thread.UncaughtExceptionHandler;

public class Browser extends Application {
    // Set to true to enable verbose logging.
    final static boolean LOGV_ENABLED = false;

    // Set to true to enable extra debug logging.
    final static boolean LOGD_ENABLED = true;

    // TODO: do something constant values might be wrong
    final static String EXTRA_SHARE_FAVICON = "share_favicon";
    final static String EXTRA_SHARE_SCREENSHOT = "share_screenshot";

    private UncaughtExceptionHandler mHandler;

    @Override
    public void onCreate() {
        super.onCreate();

        // create CookieSyncManager with current Context
        CookieSyncManager.createInstance(this);
        BrowserSettings.initialize(getApplicationContext());
        //Preloader.initialize(getApplicationContext());

        // Leave empty, Play Market use built in exception handling mechanism.
        // Setup handler for uncaught exceptions.
        //mHandler = new SimpleUncaughtExceptionHandler(getApplicationContext());
        //Thread.setDefaultUncaughtExceptionHandler(mHandler);
    }

}

