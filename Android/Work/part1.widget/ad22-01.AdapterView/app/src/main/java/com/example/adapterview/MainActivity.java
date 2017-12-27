package com.example.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private Spinner spinner1;
    private AutoCompleteTextView autoCompleteTextView1;
    private ListView listView1;
    private String[] items = {"1","2","3","4","5"};
    private String[] months = {"January", "February", "March", "April", "May", "June" ,
            "July", "August", "September", "October", "November", "December"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1.findViewById(R.id.textview1);
        spinner1.findViewById(R.id.spinner1);
        autoCompleteTextView1.findViewById(R.id.autocompletetextview1);
        listView1.findViewById(R.id.listview1);

        // adapter 생성
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<String>(MainActivity.this,  android.R.layout.simple_spinner_item,  items);

        // spinner와 adapter를 연결
        spinner1.setAdapter(adapterSpinner);

        // spinner 리스너 설정정
       spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = items[position];
                textView1.setText(selecteditem);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /* AutoCompleteTextView 와 adapter 연동.
        *  1. 데이터 만들기
        *  2. adapter 생성
        *  3. AutoCompleteTextView 와 adapter 연결
        *  4. 리스너 설정
        * */


        ArrayAdapter<String> adapterMonth = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, months);

        autoCompleteTextView1.setAdapter(adapterMonth);
        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = ((TextView)view).getText().toString();
                textView1.setText(selecteditem);
            }
        });







    }
}
