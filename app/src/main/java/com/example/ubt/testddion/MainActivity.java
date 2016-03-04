package com.example.ubt.testddion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holdTest();
    }

    private void holdTest() {
        Log.i("hell", "[[[[[[[[[[[[[[[");
        Log.i("tag", "aaaaaaaaaaaaaa");

    }
}
