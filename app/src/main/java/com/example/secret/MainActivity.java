package com.example.secret;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout masterKeyField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masterKeyField = findViewById(R.id.masterKey);
        submitButton = findViewById(R.id.loginSubmitBtn);
        submitButton.setOnClickListener(v -> {
            final String inputText = masterKeyField.getEditText().getText().toString();
            Toast.makeText(MainActivity.this, "Your password is: " + inputText, Toast.LENGTH_SHORT).show();
        });
    }
}