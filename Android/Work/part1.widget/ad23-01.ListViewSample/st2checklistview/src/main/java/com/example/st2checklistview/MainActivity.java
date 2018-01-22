package com.example.st2checklistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button btn_add, btn_delete, btn_modify;
    private ListView listView1;
    private EditText editText1;
    List<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_add = findViewById(R.id.btn_add);
        btn_delete = findViewById(R.id.btn_delete);
        btn_modify = findViewById(R.id.btn_modify);
        listView1 = findViewById(R.id.listview1);
        editText1 = findViewById(R.id.edittext1);

        ClickHandler handler = new ClickHandler();
        btn_add.setOnClickListener(handler);
        btn_delete.setOnClickListener(handler);
        btn_modify.setOnClickListener(handler);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = list.get( position );
                editText1.setText(text);
            }
        });


        //데이터 만들기
        // array.xml에서 데이터 가져와 배열에 담기.
        String[] items = getResources().getStringArray(R.array.items);
        // 배열을 리스트로 변환
        list = new ArrayList<String>(Arrays.asList(items));

        //adaper 생성    &    adapter 데이터 추가
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_multiple_choice, list);

        //adapter 연결
        listView1.setAdapter(adapter);
    }

    private class ClickHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            int position =-1;
            String temp = "";
            SparseBooleanArray sarray;

            switch (v.getId()){
                case R.id.btn_add:  //데이터 추가
                    temp = editText1.getText().toString();
                    list.add(temp);
                    adapter.notifyDataSetChanged(); // ListView 새로고침.
                    listView1.smoothScrollToPosition( list.size()-1 ); // ListView 마지막 레코드로 이동.
                    editText1.setText("");
                    break;

                case R.id.btn_modify:  //데이터 수정
                    sarray = listView1.getCheckedItemPositions(); // 선택된 체크박스의 인덱스 번호 가져오기.
                    temp = editText1.getText().toString();

                    for (int i=0;i<sarray.size();i++){

                        position = sarray.keyAt(i);
                        list.set( position, temp );
                    }

                    adapter.notifyDataSetChanged(); // ListView 새로고침.
                    listView1.smoothScrollToPosition( list.size()-1 ); // ListView 마지막 레코드로 이동.

                    editText1.setText("");

                    listView1.clearChoices();
                    break;

                case R.id.btn_delete:  //데이터 삭제
                    sarray = listView1.getCheckedItemPositions(); // 선택된 체크박스의 인덱스 번호 가져오기.

                    for (int i=sarray.size()-1; i >=0 ;i--){
                        position = sarray.keyAt( i) ;
                        list.remove(position);
                    }

                    adapter.notifyDataSetChanged(); // ListView 새로고침.
                    editText1.setText(""); //editText 초기화
                    listView1.clearChoices(); //radio 선택해제
                    break;
            }
        }

    }
}
