package com.example.dronesos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button btnL_login,btnL_Emrg;
TextView txtSU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailET_login =findViewById(R.id.emailET_login);
        EditText passET_login = findViewById(R.id.passET_login);
        TextView txtSU=findViewById(R.id.txtSU);
        btnL_Emrg=findViewById(R.id.btnL_Emrg);
        btnL_Emrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Call_SOS.class);
                startActivity(i);
            }
        });

        btnL_login=(findViewById(R.id.btnL_login));
        btnL_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((emailET_login.getText().toString().isEmpty() && passET_login.getText().toString().isEmpty())){
                    Toast.makeText(getApplicationContext(), "Please Enter All Field", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(emailET_login.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (passET_login.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Your Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent i=new Intent(MainActivity.this,Home.class);
                startActivity(i);
            }
        });
        txtSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}