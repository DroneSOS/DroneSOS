package com.example.dronesos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class SignUp extends AppCompatActivity {

    EditText nameET, emailET, passET, phoneET, addET, dateET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button btnsignup = findViewById(R.id.btnsignup);
        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
        passET = findViewById(R.id.passET);
        phoneET = findViewById(R.id.phoneET);
        addET = findViewById(R.id.addET);
        dateET = findViewById(R.id.dateET);


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameET.getText().toString();
                String email = emailET.getText().toString();
                String password = passET.getText().toString();
                String phoneNo = phoneET.getText().toString();
                String address = addET.getText().toString();
                String date = dateET.getText().toString();
//
//                if ((name.isEmpty() && email.isEmpty() && passET.getText().toString().isEmpty() && phoneET.getText().toString().isEmpty() && addET.getText().toString().isEmpty()) && dateET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "Please Enter All Field", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if (nameET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "PLEASE ENTER YOUR NAME", Toast.LENGTH_SHORT).show();
//                    return;
//                } else if (emailET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "PLEASE ENTER YOUR EMAIL ID", Toast.LENGTH_SHORT).show();
//                    return;
//                } else if (passET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "PLEASE ENTER YOUR PASSWORD", Toast.LENGTH_SHORT).show();
//                    return;
//                } else if (phoneET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "PLEASE ENTER YOUR PHONE NUMBER", Toast.LENGTH_SHORT).show();
//                    return;
//                } else if (addET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "PLEASE ENTER ADDRESS", Toast.LENGTH_SHORT).show();
//                    return;
//                } else if (dateET.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "Please enter date of joining", Toast.LENGTH_SHORT);
//                    return;
//                }
                Intent i = new Intent(SignUp.this,Home.class);
                startActivity(i);
            }
        });
        dateET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDate();
            }
        });

    }

    private void selectDate() {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                dateET.setText(day + "-" + (month + 1) + "-" + year);
            }
        }, year, month, day);
        datePickerDialog.show();
    }
}
