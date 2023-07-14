package com.example.uiue_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  EditText email,password;
    private Button logInButton;
    private TextView wrongText,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.email);
        password=findViewById(R.id.password);

        logInButton= findViewById(R.id.logIn);
        wrongText=findViewById(R.id.wrongText);
        register=findViewById(R.id.go_to_register);

        logInButton.setOnClickListener(this);
        register.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.logIn){
            String user_email= email.getText().toString();
            String user_password= password.getText().toString();

            if(user_email.equals("p@gmail.com") && user_password.equals("1234")){
                Intent intent =new Intent(MainActivity.this,home.class);
                startActivity(intent);
            }
            else{
                wrongText.setText("Wrong Email or Password!");
                wrongText.setVisibility(View.VISIBLE);
            }
        }
        if(view.getId()==R.id.go_to_register) {
            Intent intent =new Intent(MainActivity.this,SignUp.class);
            startActivity(intent);
        }


    }


}