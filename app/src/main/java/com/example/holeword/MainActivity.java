package com.example.holeword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner  mSpinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>  adapter = new ArrayAdapter<>(this,R.layout.spinner_item,android.R.id.text1);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        List<String>   list = new ArrayList<>();

        list.add("tttttttttttttfdfdfadfdfdfdfdfdttttttttttttttttttttttttttttttttttttttttttttttttttt");
        list.add("wwwww");
        adapter.addAll(list);
        mSpinner.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
