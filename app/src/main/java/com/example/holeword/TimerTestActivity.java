package com.example.holeword;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  
 * User: Geek_Soledad(msdx.android@qq.com) 
 * Date: 2015-07-27 
 * Time: 12:12 
 * FIXME 
 */

@EActivity(R.layout.activity_test)
public class TimerTestActivity  extends Activity {

    @ViewById
    public TextView    textView2;


    public Handler    myHandl = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 1){
                SimpleDateFormat   sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
                textView2.setText(sdf.format(new Date(AppConfig.currentTime)));
                myHandl.sendEmptyMessageDelayed(1, 1000);
            }
        }
    };


    @Click
    public  void   button2(){
        myHandl.removeMessages(1);
        AppConfig.serverDestroy = true;
        Intent  mIntent = new Intent(this,MyService.class);
        stopService(mIntent);
        textView2.setText(2);
       // myHandl.sendEmptyMessageDelayed(1,1000);
    }

    @Click
    public  void   button(){
        Intent  mIntent = new Intent(this,MyService.class);
        startService(mIntent);
        myHandl.removeMessages(1);
        myHandl.sendEmptyMessageDelayed(1, 1000);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0){
            showDialog();

        }
        return super.onKeyDown(keyCode, event);
    }

    public   void   showDialog(){
        new AlertDialog.Builder(this).setTitle("提示").setMessage("确定要出？").
                setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferenceHelp  sp = new SharedPreferenceHelp(TimerTestActivity.this);
                        sp.insertValue("time",AppConfig.currentTime);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(0);
                        finish();
                        System.out.println("currt2=" + AppConfig.currentTime);
                    }
                }).setNeutralButton("取消",null).show();
    }
}
