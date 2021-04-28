package com.miftarom.sablonapp.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.miftarom.sablonapp.R;
import com.miftarom.sablonapp.pelanggan.Etalase;
import com.miftarom.sablonapp.users.Login;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomAdmin2 extends AppCompatActivity {

    String admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_admin2);
        ButterKnife.bind(this);

        Intent i = getIntent();
        String username = i.getStringExtra("nama");
        admin=username;
    }
    @OnClick(R.id.btnKeluar)
    void Login() {
        Intent i = new Intent(HomAdmin2.this, Login.class);
        startActivity(i);
        finish();
    }
    @OnClick(R.id.LhtEtalase)
    void SeeEtalase() {
        Intent i = new Intent(HomAdmin2.this, Etalase.class);
        i.putExtra("nama",admin);
        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(HomAdmin2.this, Login.class);
        startActivity(i);
        finish();
    }
}