package com.example.administrator.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class AddButtonActivity extends AppCompatActivity {

    private Button btnAdd;
    private LinearLayout scroll;
    private Button btnAdd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);

        btnAdd = findViewById(R.id.btnAdd);
        scroll = findViewById(R.id.scroll);
        btnAdd5 = findViewById(R.id.btnAdd5);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 추가되는 버튼에 대한 LayoutParam 설정, 뷰영역 설정

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT
                        , LinearLayout.LayoutParams.WRAP_CONTENT
                );
                //마진 추가
                lp.setMargins(10,10,10,10);

                // 버튼생성
                Button btn = new Button(getApplicationContext());
                btn.setText(R.string.app_name);
                btn.setText("push me");
                btn.setLayoutParams(lp); // 생성된 버튼의 뷰영역 설정
                btn.setBackgroundColor(Color.DKGRAY);

                // LinearLayout에 추가, View.addView() 메서드 이용
                scroll.addView(btn);


            }
        });

        btnAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 추가되는 버튼에 대한 LayoutParam 설정, 뷰영역 설정

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT
                        , LinearLayout.LayoutParams.WRAP_CONTENT
                );
                //마진 추가
                lp.setMargins(10,10,10,10);
                for(int i = 0; i<=4;i++){
                    // 버튼생성
                    Button btn = new Button(getApplicationContext());
                    btn.setText(R.string.app_name);
                    btn.setText("push me");
                    btn.setLayoutParams(lp); // 생성된 버튼의 뷰영역 설정
                    btn.setBackgroundColor(Color.DKGRAY);

                    // LinearLayout에 추가, View.addView() 메서드 이용
                    scroll.addView(btn);

                }

            }
        });
    }
}
