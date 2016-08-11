package com.example.liba.hellolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.Md5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Md5 md5=new Md5();
        Log.i("test",md5.MD5("hell md5").toLowerCase());
    }
}
