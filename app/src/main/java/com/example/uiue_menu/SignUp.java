package com.example.uiue_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    private Button registerButton;
    private TextView signInText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        registerButton=findViewById(R.id.registerbtn);
        signInText=findViewById(R.id.go_to_signIn);

        registerButton.setOnClickListener(this);
        signInText.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.registerbtn) {
            Intent intent =new Intent(SignUp.this,MainActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.go_to_signIn) {
            Intent intent =new Intent(SignUp.this,MainActivity.class);
            startActivity(intent);
        }
    }
}