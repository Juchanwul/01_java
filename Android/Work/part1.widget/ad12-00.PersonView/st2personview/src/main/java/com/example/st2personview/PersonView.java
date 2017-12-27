package com.example.st2personview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.LayoutInflaterFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-26.
 */


public class PersonView  extends RelativeLayout{
    //위젯 선언
    ImageView imagePhoto, imageCheck;
    TextView textName, textAge;

    public PersonView(Context context) {
        super(context);

        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs, 0);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        //Layout 관련 필수 설정
        //없음

        //디자인 xml파일 inflation 하기. inflation : xml을 java 인스턴스로 바꾸기.
        LayoutInflater.from(context).inflate(R.layout.view_person, this, true);

        //위젯 찾기
        textName = findViewById(R.id.text_name);
        textAge = findViewById(R.id.text_age);
        imagePhoto = findViewById(R.id.image_photo);
        imageCheck = findViewById(R.id.image_check);


        //CustionView에서 attr로 정의한 속성값 가져오기

        if( attrs != null){
            TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.PersonView, defStyleAttr, 0);
            String name = ta.getString(R.styleable.PersonView_my_name);
            textName.setText(name);

            Integer age = ta.getInt(R.styleable.PersonView_my_age,-1);
            textAge.setText(age+"");

            Drawable photo = ta.getDrawable(R.styleable.PersonView_my_photo);
            imagePhoto.setImageDrawable(photo);

            //재사용. 반드시 호출
            ta.recycle();
        }

        //위젯찾고 값설정

    }
}
