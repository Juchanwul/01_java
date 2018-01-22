package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ListView listView1;
    EditText editText1;
    Button button1;
    List<String> list;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView   = findViewById(R.id.textView1);
        listView1 = findViewById(R.id.listView1);
        editText1 = findViewById(R.id.editText1);
        button1   = findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText1.getText().toString();
                if(!TextUtils.isEmpty(input)){
                    //데이터 추가
                    list.add(input);

                    // listView를 새로고침
                    adapter.notifyDataSetChanged();

                    // listView의 현재 위치를 마지막 데이터로 이동.
                    listView1.smoothScrollToPosition( list.size() - 1 );
                }
            }
        });

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        // 4.데이터 만들기
        String[] items = getResources().getStringArray(R.array.items);
        list = new ArrayList<String>(Arrays.asList(items));

        // 5.어뎁터 설정   &  6.데이터 추가
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, list);


        // 7.어뎁터 연결
        listView1.setAdapter(adapter);
    }
}
