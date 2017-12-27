package com.example.administrator.reservationapp;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Chronometer  chronometer1 = null;
    private Button       button1= null;
    private RadioGroup   radioGroup = null;
    private RadioButton  radioButton= null;
    private RadioButton  radioButton2= null;
    private CalendarView calendarView= null;
    private TimePicker   timePicker= null;
    private Button       button2= null;
    private TextView     textView = null;
    private Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer1 = findViewById(R.id.chronometer1);
        button1 = findViewById(R.id.button1);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        calendarView = findViewById(R.id.calendarView);
        timePicker = findViewById(R.id.timePicker);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);


        date.setTime(calendarView.getDate());


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup.setVisibility(View.VISIBLE);

                chronometer1.start();

                }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.stop();
                String s = "";
                s = "예약하신 날짜는 " + date + timePicker.getHour()+"시 "+timePicker.getMinute()+"분 입니다.";
                textView.setText(s);
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                calendarView.setVisibility(View.VISIBLE);
                timePicker.setVisibility(View.INVISIBLE);
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                timePicker.setVisibility(View.VISIBLE);
                calendarView.setVisibility(View.INVISIBLE);
            }
        });







    }
}
