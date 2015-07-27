package com.example.mylibrary;

import android.app.Activity;
import android.os.Bundle;

/** 
* User: Geek_Soledad(king) 
* Date: 2015-07-23 
* Time: 14:44 
* FIXME 
*/
public class BaseActivity  extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }



    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
