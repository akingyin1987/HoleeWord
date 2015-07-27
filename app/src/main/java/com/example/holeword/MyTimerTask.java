package com.example.holeword;

import java.util.TimerTask;

/**
 *  
 * User: Geek_Soledad(msdx.android@qq.com) 
 * Date: 2015-07-27 
 * Time: 11:22 
 * FIXME 
 */
public class MyTimerTask extends TimerTask {


    private   MyTimerTask(){}

    private   static   MyTimerTask   intence;

    public    static    MyTimerTask  getIntence(){
        if(null == intence){
            intence = new MyTimerTask();
        }
        return  intence;
    }


    public    static    void   onDestory(){
        if(null != intence){
            intence.cancel();
            intence = null;
        }
    }

    public   static    long    Time = 0;
    @Override
    public void run() {
        System.out.println("currentTime=" + AppConfig.currentTime+":"+MyService.time);
         AppConfig.currentTime = AppConfig.currentTime + 1000;
         MyTimerTask.Time = MyTimerTask.Time + 1000;
         MyService.time = MyService.time + 1000;
    }
}
