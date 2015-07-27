package com.example.holeword;

import java.util.Timer;

/**
 *  
 * User: Geek_Soledad(msdx.android@qq.com) 
 * Date: 2015-07-27 
 * Time: 11:20 
 * FIXME 
 */
public class MyTimer  extends Timer {

    private   MyTimer(){}

    private    static    MyTimer    intence;

    public    static     MyTimer    getIntence(){
        if(null == intence){
            intence = new MyTimer();
        }
        return  intence;
    }


    public   static    void   onStart(){
        System.out.println("current1:" + AppConfig.currentTime);
        MyTimer.onDestory();
        MyTimerTask.onDestory();
        System.out.println("current2:" + AppConfig.currentTime);
        MyTimer.getIntence().schedule(MyTimerTask.getIntence(),0,1000);
    }


    public   static    void   onDestory(){
        if(null != intence){
            intence.cancel();
            intence = null;
        }
    }
}
