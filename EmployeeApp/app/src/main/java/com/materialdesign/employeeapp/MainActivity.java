package com.materialdesign.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {
    Button btnadmin_button, Employee;
    TextView ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnadmin_button = (Button)findViewById(R.id.admin_button);
        Button Employee = (Button) findViewById(R.id.employee_button);
        TextView ForgotPassword = (TextView) findViewById(R.id.forgot_password);
        }



    public void AdminClicked(View view) {
        Intent intent = new Intent(MainActivity.this, employeeregisterpage.class);
        startActivity(intent);
    }

    public void PasswordClicked(View view) {
        Intent intent = new Intent(MainActivity.this, ResetPassword.class);
        startActivity(intent);
    }

    public void EmpClicked(View view) {
        Intent intent = new Intent(MainActivity.this, EmployeeDetails.class);
        startActivity(intent);
    }

}


