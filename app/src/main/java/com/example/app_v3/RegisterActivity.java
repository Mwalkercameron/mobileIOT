package com.example.app_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    TextView btn;

    private EditText inputUsername,inputPassword,inputEmail,inputConfirmPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn = findViewById(R.id.haveAccount);
        inputUsername=findViewById(R.id.inputUsername);
        inputEmail=findViewById(R.id.loginEmail);
        inputPassword=findViewById(R.id.inputPassword);
        inputConfirmPassword=findViewById(R.id.inputConfirmPassword);

        btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCredentials();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }

    private void checkCredentials() {
        String username=inputUsername.getText().toString();
        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();
        String confirmPassword=inputConfirmPassword.getText().toString();

        if(username.isEmpty() || username.length()<7){
            showError(inputUsername, "Username is invalid");
        }
        else if(email.isEmpty() || email.contains("@")){
            showError(inputEmail, "Email is not valid");
        }
        else if (password.isEmpty() || password.length()<8){
            showError(inputPassword, "Password must be 8 characters");
        } else if (confirmPassword.isEmpty() || confirmPassword.equals(password)) {
            showError(inputConfirmPassword, "Password does not match");

        }
        else{
            Toast.makeText(this, "Call Registration Method",Toast.LENGTH_SHORT).show();
        }

    }

    private void showError(EditText input, String s) {
     input.setError(s);
     input.requestFocus();
    }
}