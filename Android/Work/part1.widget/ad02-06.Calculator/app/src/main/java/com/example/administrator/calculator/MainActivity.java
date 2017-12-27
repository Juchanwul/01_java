package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1 = null;
    EditText num2 = null;

    Button btnAdd = null;
    Button btnMin = null;
    Button btnMul = null;
    Button btnDiv = null;
    Button btnMod = null;

    TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnAdd = findViewById(R.id.btnAdd);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);

        result = findViewById(R.id.result);

        /*
        btnAdd.setOnClickListener(new add());
        btnMin.setOnClickListener(new min());
        btnMul.setOnClickListener(new mul());
        btnDiv.setOnClickListener(new div());
        btnMod.setOnClickListener(new mod());
        */

        calculate handler = new calculate();

        btnAdd.setOnClickListener(handler);
        btnMin.setOnClickListener(handler);
        btnMul.setOnClickListener(handler);
        btnDiv.setOnClickListener(handler);
        btnMod.setOnClickListener(handler);
    }

    private class calculate implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            CharSequence str = null;

            if (num1.getText().toString().equals("") || num1.getText().toString() == null) {
                Toast.makeText(getApplicationContext(), "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
                return;
            }
            if (num2.getText().toString().equals("") || num2.getText().toString() == null) {
                Toast.makeText(getApplicationContext(), "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
                return;
            }

            Float num11 = Float.valueOf(num1.getText().toString());
            Float num22 = Float.valueOf(num2.getText().toString());
            Float result1 = null;

            int id = view.getId(); // 클릭된 id, int 값.
            if ( id == R.id.btnAdd) {
                result1 = num11 + num22;
            }
            else if ( id == R.id.btnMin) {
                result1 = num11 - num22;
            }
            else if ( id == R.id.btnMul) {
                result1 = num11 * num22;
            }
            else if ( id == R.id.btnDiv) {
                if (num22 == 0) {
                    Toast.makeText(getApplicationContext(), "0 으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result1 = num11 / num22;
            }
            else if ( id == R.id.btnMod) {
                if (num22 == 0) {
                    Toast.makeText(getApplicationContext(), "0 으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result1 = num11 % num22;
            }
            str = "계산결과 : " + result1;
            result.setText(str);

        }
    }

}
