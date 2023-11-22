package com.example.testnavigetor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView  textView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView1=findViewById(R.id.textView3);
        String UserNAme=getIntent().getStringExtra("UserName");
        textView1.setText(UserNAme);
    }
}