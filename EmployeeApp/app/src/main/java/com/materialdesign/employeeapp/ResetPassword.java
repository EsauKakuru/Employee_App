package com.materialdesign.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResetPassword extends AppCompatActivity {
    EditText txtnewpassword, txtconfirmnew;
    Parent parent;
    Button btnreset_password_button;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        txtnewpassword = (EditText)  findViewById(R.id.newpassword);
        txtconfirmnew= (EditText)  findViewById(R.id.confirmnew);
        parent = new Parent();
        reference= FirebaseDatabase.getInstance().getReference().child("Parent");
        btnreset_password_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.setNewpassword(txtnewpassword.getText().toString().trim());
                parent.setConfirmnew(txtconfirmnew.getText().toString().trim());
                reference.push().setValue(parent);
                Toast.makeText(ResetPassword.this, "Password successfully reset",Toast.LENGTH_LONG).show();

            }
        });

    }
}