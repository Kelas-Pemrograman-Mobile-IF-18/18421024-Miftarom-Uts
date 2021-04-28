package com.miftarom.sablonapp.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.miftarom.sablonapp.R;
import com.miftarom.sablonapp.admin.HomAdmin2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {

    @BindView(R.id.edtUserName)
    EditText edtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
    }
    @OnClick(R.id.btnRegis)
    void Registrasi(){
        Intent i =  new Intent(Login.this, Regis.class);
        startActivity(i);
        finish();
    }
    @OnClick(R.id.Loginbtn)
    void Login(){
        String username = edtUsername.getText().toString();
        if (username.contains("admin")) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent i =  new Intent(Login.this, HomAdmin2.class);
            i.putExtra("nama", username);
            startActivity(i);
        }else if (username.contains("miftarom")){
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent i =  new Intent(Login.this, HomUser.class);
            i.putExtra("nama", username);
            startActivity(i);
        }else {
            Toast.makeText(this, "Login Gagal /Username tidak terdaftar", Toast.LENGTH_SHORT).show();
        }
    }
}