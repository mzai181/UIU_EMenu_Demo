package com.example.uiue_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity implements View.OnClickListener {

    private ImageView olympiaImg;
    private TextView olympiaText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        olympiaImg=findViewById(R.id.olympiaImg);
        olympiaText=findViewById(R.id.olympiaText);

        olympiaImg.setOnClickListener(this);
        olympiaText.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        menuInflater.inflate(R.menu.search,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.olympiaImg) {
            Intent intent =new Intent(home.this,Canteen.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.olympiaText) {
            Intent intent =new Intent(home.this,Canteen.class);
            startActivity(intent);
        }
    }
}