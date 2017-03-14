package com.example.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.destroy_btn)
    Button btn_destroy;

    @BindView(R.id.start_btn)
    Button btn_start;

    @BindView(R.id.editText)
    EditText editText;

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);   // 为什么总是忘了这一句!
        Log.d(TAG, "onCreate");

        btn_destroy = (Button) findViewById(R.id.destroy_btn);
        btn_start = (Button) findViewById(R.id.start_btn);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @OnClick(R.id.destroy_btn)
    public void onClick() {
        finish();
    }

    @OnClick(R.id.start_btn)
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }

    @OnTextChanged(R.id.editText)
    public void setText(CharSequence s) {
        data = s.toString();
    }


}
