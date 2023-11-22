package com.example.testnavigetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        editText1=findViewById(R.id.editTextText);
        editText2=findViewById(R.id.editTextText2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=editText1.getText().toString();
                Intent go = new Intent(MainActivity.this,MainActivity2.class);
                go.putExtra("UserName",userName);
                startActivity(new Intent(go));

            }
        });
    }
}