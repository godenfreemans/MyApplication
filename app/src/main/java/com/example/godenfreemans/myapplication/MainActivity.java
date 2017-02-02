package com.example.godenfreemans.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) this.findViewById(R.id.button4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView4);
                RadioGroup Add1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup Add2 = (RadioGroup) findViewById(R.id.radioGroup2);
                int add1_ID = Add1.getCheckedRadioButtonId();
                int add2_ID = Add2.getCheckedRadioButtonId();
                RadioButton add1 = (RadioButton) findViewById(add1_ID);
                RadioButton add2 = (RadioButton) findViewById(add2_ID);
                int A = add1.getText().charAt(0) - '0';
                int B = add2.getText().charAt(0) - '0';
                int C = A + B;
                tv.setText(String.valueOf(C));
            }
        });
    }
}
