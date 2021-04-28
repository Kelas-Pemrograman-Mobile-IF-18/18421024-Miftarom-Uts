package com.miftarom.sablonapp.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.miftarom.sablonapp.R;
import com.miftarom.sablonapp.admin.HomAdmin2;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Regis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
    }
    @OnClick(R.id.btnLogin)
    void Login(){
        Intent i =  new Intent(Regis.this, Login.class);
        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Regis.this, Login.class);
        startActivity(i);
        finish();
    }
}