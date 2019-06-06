package com.fastcampus.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

/*       Intent intent = getIntent();
        int data = intent.getIntExtra("INTENT_KEY", 0);
        String dataStr = intent.getStringExtra("INTENT_KEY_STR");
        Log.d("intent_key", data + "");
        Log.d("intent_key", dataStr);*/

        Intent intent = new Intent();
        intent.putExtra("RESULT", "성공");
        setResult(200,intent);
        finish();


    }

    @Override
    protected void onPause() {
        Log.d("lifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("lifeCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("lifeCycle", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d("lifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("lifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifeCycle", "onDestroy");
        super.onDestroy();
    }



}
