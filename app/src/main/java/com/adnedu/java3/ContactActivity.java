package com.adnedu.java3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    TextView tvName, tvDetails;
    Button btnTouch;
    EditText etFName, etLName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        tvName=(TextView)findViewById(R.id.tvName);
        tvDetails=(TextView)findViewById(R.id.tvDetails);
        btnTouch=(Button)findViewById(R.id.btnClick);
        etFName=(EditText)findViewById(R.id.etFirstName);
        etLName=(EditText)findViewById(R.id.etLastName);

        btnTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = etFName.getText().toString();
                String lastName = etLName.getText().toString();

                int a  = Integer.parseInt(firstName);
                int b  = Integer.parseInt(lastName);
                int c=a+b;

                tvDetails.setText(""+c);
            }
        });


    }
}
