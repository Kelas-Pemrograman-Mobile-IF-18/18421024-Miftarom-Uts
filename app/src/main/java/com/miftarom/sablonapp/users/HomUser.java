package com.miftarom.sablonapp.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.miftarom.sablonapp.R;
import com.miftarom.sablonapp.admin.HomAdmin2;
import com.miftarom.sablonapp.pelanggan.Etalase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomUser extends AppCompatActivity {

    @BindView(R.id.txtUser)
    TextView txtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_user);
        ButterKnife.bind(this);

        Intent i = getIntent();
        String username = i.getStringExtra("nama");
        txtUser.setText(username);

    }
    @OnClick(R.id.LhtEtalase)
    void SeeEtalase() {
        String username = txtUser.getText().toString();
        Intent i = new Intent(HomUser.this, Etalase.class);
        i.putExtra("nama",username);
        startActivity(i);
        finish();
    }
    @OnClick(R.id.btnKeluar)
    void Login() {
        Intent i = new Intent(HomUser.this, Login.class);
        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(HomUser.this, Login.class);
        startActivity(i);
        finish();
    }
}