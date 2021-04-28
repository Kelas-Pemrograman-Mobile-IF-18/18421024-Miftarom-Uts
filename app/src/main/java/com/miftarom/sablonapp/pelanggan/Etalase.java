package com.miftarom.sablonapp.pelanggan;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.miftarom.sablonapp.R;
import com.miftarom.sablonapp.admin.HomAdmin2;
import com.miftarom.sablonapp.users.HomUser;
import com.miftarom.sablonapp.users.Login;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Etalase extends AppCompatActivity {

    String User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etalase);
        getSupportActionBar().hide();
        ButterKnife.bind(this);

        Intent i = getIntent();
        String username = i.getStringExtra("nama");
        User=username;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (User.contains("miftarom")){
            Intent i = new Intent(Etalase.this, HomUser.class);
            i.putExtra("nama", User);
            startActivity(i);
        }else if (User.contains("admin")){
            Intent i = new Intent(Etalase.this, HomAdmin2.class);
            i.putExtra("nama", User);
            startActivity(i);
        }
    }
}