package com.adnedu.java3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser=(EditText)findViewById(R.id.etUser);
        etPass=(EditText)findViewById(R.id.etPass);
        btnLogin=(Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUser.getText().toString();
                String pass = etPass.getText().toString();

                Intent myint = new Intent(LoginActivity.this, DashboardActivity.class);
                myint.putExtra("user", username);
                myint.putExtra("pass", pass);
                startActivity(myint);

            }
        });


    }
}
