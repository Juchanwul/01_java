package com.example.administrator.basicwidget;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이벤트 헨들러 설정
        Button button1 = null;
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"RadioActivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), RadioActivity.class);
                startActivity(i);
            }
        });
        Button button2 = null;
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WidthButtonAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), WidthButtonAtivity.class);
                startActivity(i);

            }
        });
        Button button3 = null;
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"HeightButtonAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), HeightButtonAtivity.class);
                startActivity(i);
            }
        });
        Button button4 = null;
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ColorButtonAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ColorButtonAtivity.class);
                startActivity(i);
            }
        });
        Button button5 = null;
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"VisibleAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), VisibleAtivity.class);
                startActivity(i);
            }
        });
        Button button6 = null;
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"MarginAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MarginAtivity.class);
                startActivity(i);
            }
        });
        Button button7 = null;
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"PaddingAtivity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), PaddingAtivity.class);
                startActivity(i);
            }
        });

    }


}
