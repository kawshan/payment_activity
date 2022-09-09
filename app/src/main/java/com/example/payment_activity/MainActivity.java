package com.example.payment_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText1;
    private TextView textView3;
    private Button payButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText2);
        payButton=findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);

    }
    public void pay(View view){
        String val1=editText.getText().toString();
        String val2=String.valueOf( editText1.getText().toString());
        textView3.setText(val1+" " +val2);
    }
}