package com.example.holeword;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 *  
 * User: Geek_Soledad(msdx.android@qq.com) 
 * Date: 2015-07-27 
 * Time: 15:50 
 * FIXME 
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("com.zlcdgroup.OpenServer")){
            Intent  mIntent = new Intent(context,MyService.class);
            context.startService(mIntent);
        }
    }
}
