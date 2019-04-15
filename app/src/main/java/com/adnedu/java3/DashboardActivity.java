package com.adnedu.java3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tvUser = (TextView)findViewById(R.id.tvUsername);

        Intent newint = getIntent();
//        Bundle data = newint.getExtras();
        String username = newint.getStringExtra("user");
        String pass = newint.getStringExtra("pass");

        tvUser.setText(username);
    }
}
