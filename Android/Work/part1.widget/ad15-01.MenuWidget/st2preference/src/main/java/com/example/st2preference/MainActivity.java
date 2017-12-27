package com.example.st2preference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSave;
    private EditText edtNumber;
    private EditText edtText;
    private CheckBox ckSound;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = findViewById(R.id.btnSave);
        edtNumber = findViewById(R.id.edtNumber);
        edtText = findViewById(R.id.edtText);
        ckSound = findViewById(R.id.ckSound);


        //위젯설정
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pref.edit();

                editor.putBoolean( "SOUND_SET" , ckSound.isChecked() );
                editor.putInt( "TEXT_NUMBER", Integer.parseInt(edtNumber.getText().toString()));
                editor.putString( "TEXT_STRING" , edtText.getText().toString() );
                editor.apply();
            }
        });

        //preference 객체얻기
        pref = getSharedPreferences("Settings", MODE_PRIVATE);
        Boolean ck = pref.getBoolean("SOUND_SET", false) ;
        Integer number = pref.getInt("TEXT_NUMBER", -1);
        String txt = pref.getString( "TEXT_STRING","");

        ckSound.setChecked(ck);
        edtNumber.setText(number.toString());
        edtText.setText(txt);

    }
}
