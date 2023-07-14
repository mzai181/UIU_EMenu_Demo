package com.example.uiue_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Canteen extends AppCompatActivity implements View.OnClickListener {

    private TextView orderBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);

        orderBtn=findViewById(R.id.orderBtn);
        orderBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.orderBtn) {
            Intent intent =new Intent(Canteen.this,orderPage.class);
            startActivity(intent);
        }
    }
}