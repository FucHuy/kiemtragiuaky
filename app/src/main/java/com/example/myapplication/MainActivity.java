package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtName, txtEmail, txtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent().getExtras() != null) {
            Info info = (Info) getIntent().getExtras().get("info");
            initUI();
            txtName.setText(info.getName());
            txtEmail.setText(info.getEmail());
            txtPhone.setText(info.getPhone());
        }
    }
    private void initUI() {
        txtName = findViewById(R.id.info_name);
        txtEmail = findViewById(R.id.info_email);
        txtPhone = findViewById(R.id.info_phone);
    }
}