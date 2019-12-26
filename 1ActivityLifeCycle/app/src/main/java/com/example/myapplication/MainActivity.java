package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
        System.out.println("On Create");
        System.out.println("On Create");
        System.out.println("On Create");
        System.out.println("On Create");
        System.out.println("On Create");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause");
        System.out.println("On Pause");
        System.out.println("On Pause");
        System.out.println("On Pause");
        System.out.println("On Pause");
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
        System.out.println("On STOP");
        System.out.println("On STOP");
        System.out.println("On STOP");
        System.out.println("On STOP");
        System.out.println("On STOP");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
        System.out.println("On Destroy");
        System.out.println("On Destroy");
        System.out.println("On Destroy");
        System.out.println("On Destroy");
        System.out.println("On Destroy");
    }
}