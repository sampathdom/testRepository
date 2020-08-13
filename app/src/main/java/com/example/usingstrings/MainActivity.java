package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TxtvMsg2 = findViewById(R.id.TvMsg2);
        TxtvMsg2.setText(R.string.Msg2);
        Log.i(tag: "Lifecycle", msg: "OnCreate falied..");
    }
}