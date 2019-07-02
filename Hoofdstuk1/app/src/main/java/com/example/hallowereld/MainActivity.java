package com.example.hallowereld;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_INFO = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://developer.android.com/index.html"));
        startActivity(browserIntent);
    }
    public void startSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity");
        startActivity(intent);
    }

}
