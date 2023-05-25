package com.example.shobisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, passwordEditText, confirmpasswordEditText;
    TextView loginTextView;
    Button signupButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameEditText = findViewById(R.id.name_EditText);
        emailEditText = findViewById(R.id.email_EditText);
        passwordEditText = findViewById(R.id.password_EditText);
        confirmpasswordEditText = findViewById(R.id.confirm_password_EditText);
        signupButton = findViewById(R.id.signup_Button);
        loginTextView = findViewById(R.id.login_TextView);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirm_password = confirmpasswordEditText.getText().toString();

                HelperClass helperClass = new HelperClass(name, email, password, confirm_password);
                reference.child(name).setValue(helperClass);

                Toast.makeText(SignUpActivity.this, "You have Signed Up Successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}