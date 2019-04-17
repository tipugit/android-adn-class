package com.adnedu.java3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton ibProthomAlo, ibIttefaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ibProthomAlo = (ImageButton) findViewById(R.id.btnProthom);
        ibIttefaq= (ImageButton) findViewById(R.id.btnIttefaq);

        ibProthomAlo.setOnClickListener(this);
        ibIttefaq.setOnClickListener(this);







//        Intent newint = getIntent();
////        Bundle data = newint.getExtras();
//        String username = newint.getStringExtra("user");
//        String pass = newint.getStringExtra("pass");


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.btnProthom:
                changeActivity("https://www.prothomalo.com/");
                break;
            case R.id.btnIttefaq:
                changeActivity("https://www.ittefaq.com.bd/");
                break;
            default:
                Toast.makeText(this, "Input wrong!",  Toast.LENGTH_SHORT).show();


        }
    }


    public void changeActivity(String url)
    {
        Intent intent = new Intent(DashboardActivity.this, WebContentActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
