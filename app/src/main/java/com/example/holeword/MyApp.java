package com.example.holeword;

import android.app.Application;

import com.example.holeword.crash.CrashHandler;

/**
 *  
 * User: Geek_Soledad(msdx.android@qq.com) 
 * Date: 2015-07-27 
 * Time: 13:59 
 * FIXME 
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceHelp  sp = new SharedPreferenceHelp(this);
        sp.insertValue("crash",false);
        AppConfig.currentTime = sp.getLong("time");
        System.out.println("save====");
        CrashHandler.getInstance().init(this,null);
      //  AppConfig.currentTime = System.currentTimeMillis();
    }

    @Override
    public void onTerminate() {
        System.out.println("onTerminate="+AppConfig.currentTime);
        super.onTerminate();
    }
}
