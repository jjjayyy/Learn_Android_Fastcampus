package com.fastcampus.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lifeCycle", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("INTENT_KEY", 5);
        intent.putExtra("INTENT_KEY_STR", "STRING");
        startActivityForResult(intent, REQUEST_CODE);

/*        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https:naver.com"));
        startActivity(intent);*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUEST_CODE) {
            if(resultCode == 200) {
                String result = data.getStringExtra("RESULT");
                Log.d("onActivityResult", "result : " + result);
            } else if (resultCode == 300) {

            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
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
