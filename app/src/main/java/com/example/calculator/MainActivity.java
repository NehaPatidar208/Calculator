package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv;
    Button bt1,bt2,bt3,bt4,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.in1);
        e2=findViewById(R.id.in2);
        tv=findViewById(R.id.res);
        bt1=findViewById(R.id.b1);
        bt2=findViewById(R.id.b2);
        bt3=findViewById(R.id.b3);
        bt4=findViewById(R.id.b4);
        bt5=findViewById(R.id.b5);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                String s= Integer.toString(n1+n2);
                tv.setText(s);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                String s= Integer.toString(n1-n2);
                tv.setText(s);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                String s= Integer.toString(n1*n2);
                tv.setText(s);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                String s= Integer.toString(n1/n2);
                tv.setText(s);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                String s= Integer.toString(n1%n2);
                tv.setText(s);
            }
        });
    }
}
