package com.example.administrator.datetimewidget;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    private AnalogClock  aclock      = null;
    private DigitalClock dclock      = null;
    private Chronometer  chronometer = null;
    private TimePicker   timepicker1 = null;
    private TimePicker   timepicker2 = null;
    private DatePicker   datepicker1 = null;
    private DatePicker   datepicker2 = null;
    private CalendarView calender    = null;
    private Button       btn1        = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aclock =  findViewById(R.id.aclock);
        dclock =  findViewById(R.id.dclock);
        chronometer = findViewById(R.id.chronometer);
        timepicker1 = findViewById(R.id.timepicker1);
        timepicker2 = findViewById(R.id.timepicker2);
        datepicker1 = findViewById(R.id.datepicker1);
        datepicker2 = findViewById(R.id.datepicker2);
        calender = findViewById(R.id.calender);
        btn1 =  findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Date d = new Date();
                d.setTime(calender.getDate());
                String msg = "";
                msg +=  "aclock = " + aclock.toString() + "\n";
                msg +=  "dclock = " + dclock.getText() + "\n";
                msg +=  "chronometer = " + chronometer.getText() + "\n";
                msg +=  "timepicker1 = " + timepicker1.getCurrentHour() + " : "+timepicker1.getMinute() + "\n";
                msg +=  "timepicker2 = " + timepicker2.getCurrentHour() + " : "+timepicker2.getMinute() + "\n";
                msg +=  "datepicker1 = " + datepicker1.getYear() + "-" + datepicker1.getMonth() + "-" + datepicker1.getDayOfMonth() + "\n";
                msg +=  "datepicker2 = " + datepicker2.getYear() + "-" + datepicker2.getMonth() + "-" + datepicker2.getDayOfMonth() + "\n";;
                msg +=  "calender = " + d;

                Toast.makeText(MainActivity.this, msg , Toast.LENGTH_SHORT).show();
            }


        });



        //Chronometer 중지 & 시작
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();

        //timepicker1에 시간 설정하기
        timepicker1.setHour(13);
        timepicker1.setMinute(54);

        //datepicker1에 날짜 설정하기
        //자바에서 날짜를 처리하는 클래스
        //java.util.Date 클래스
        //java.util.Calender 클래스
        java.util.Calendar c = Calendar.getInstance();
        datepicker1.updateDate(2017,11,13);

        //calender에 날짜 설정하기       calender.setDate(10);
        Date date = new Date(114,2,18);
        calender.setDate(date.getTime());
    }
}
