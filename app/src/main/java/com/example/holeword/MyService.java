package com.example.holeword;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class MyService extends Service {

    public  static    long   time = 0;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

        super.onCreate();
        MyTimer.onStart();
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("onStartCommand");

        return super.onStartCommand(intent, flags, startId);
    }




    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestory:" + AppConfig.currentTime);
        SharedPreferenceHelp  sp = new SharedPreferenceHelp(this,null);
        if(!AppConfig.serverDestroy){
            Intent   mIntent = new Intent(this,MyService.class);
            startService(mIntent);
        }
       // MyTimer.onDestory();
    }
}
