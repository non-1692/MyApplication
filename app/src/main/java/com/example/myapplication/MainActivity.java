package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityApp";
    private int numero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       int a = suma(numero, 12);
        Log.d(TAG, "suma: " + a);

    }

    private int suma(int numero, int i) {
        int r = numero + i;
        return r;
    }


}
