package com.example.administrator.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class AutoActivity extends AppCompatActivity {

    private ScrollView scroll;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        scroll = findViewById(R.id.scroll);
        layout = findViewById(R.id.layout);

        scroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                if (scroll.getScrollY()+scroll.getHeight()==layout.getHeight()){
                    // 추가되는 버튼에 대한 LayoutParam 설정, 뷰영역 설정

                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT
                            , LinearLayout.LayoutParams.WRAP_CONTENT
                    );
                    //마진 추가
                    lp.setMargins(10, 10, 10, 10);

                    for (int i = 0; i < 20; i++) {
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

            }

        });

        }
}
