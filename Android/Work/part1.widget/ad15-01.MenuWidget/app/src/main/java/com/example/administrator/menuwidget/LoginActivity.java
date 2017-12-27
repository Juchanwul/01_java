package com.example.administrator.menuwidget;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtID;
    private EditText edtPW;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        edtPW = findViewById(R.id.edtPW);
        edtID = findViewById(R.id.edtID);


        //위젯설정
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtID.getText().toString().trim().equals("111")&& edtPW.getText().toString().equals("111")){
                    // 로그인 성공
                    SharedPreferences.Editor editor = pref.edit();

                    editor.putString( CommonCode.LOGIN_ID, edtID.getText().toString());
                    //editor.putString( "TEXT_STRING" , edtPW.getText().toString() );
                    editor.putBoolean(CommonCode.LOGIN_STATUS, true);
                    editor.apply();

                    //결과 반환 코드 작성
                    Intent data = new Intent();
                    data.putExtra(CommonCode.LOGIN_STATUS, true);

                    // 결과 반환
                    setResult(RESULT_OK, data);

                    finish();
                }
                else{
                    // 로그인 실패
                    Toast.makeText(getApplicationContext(), R.string.login_msg_fail, Toast.LENGTH_SHORT).show();
                }

            }
        });

        //preference 객체얻기
        pref = getSharedPreferences(CommonCode.FILE_PREFERENCE, MODE_PRIVATE);
        String id = pref.getString(CommonCode.LOGIN_ID, "");

        edtID.setText(id);

    }


}

