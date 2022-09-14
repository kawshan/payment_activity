package com.example.payment_activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtPaymentDetails=findViewById(R.id.editText2);
        String value=getIntent().getStringExtra("detail");
        txtPaymentDetails.setText(value);
}
}
