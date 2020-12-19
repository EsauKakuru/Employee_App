package com.materialdesign.employeeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class employeeregisterpage extends AppCompatActivity {
    EditText txtEnter_full_name ,txtenter_email_address,txtenter_password,
            txtenter_district,txtenter_department,txtenter_phone_number;
    Button btnregister_button;
    DatabaseReference reff;
    Member member;

    private FirebaseRecyclerOptions<Construct> options;
    private FirebaseRecyclerAdapter<Construct, LoadHolder> adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeeregisterpage);
        txtEnter_full_name = (EditText)  findViewById(R.id.Employee_name);
        txtenter_email_address = (EditText)  findViewById(R.id.enter_email_address);
        txtenter_password = (EditText)  findViewById(R.id.enter_password);
        txtenter_district = (EditText)  findViewById(R.id.enter_district);
        txtenter_department= (EditText)  findViewById(R.id.enter_department);
        txtenter_phone_number= (EditText)  findViewById(R.id.enter_phone_number);
        btnregister_button= (Button)  findViewById(R.id.Logout_button);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        member = new Member();
        reff=FirebaseDatabase.getInstance().getReference().child("Member");
        btnregister_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                member.setEnter_full_name(txtEnter_full_name.getText().toString().trim());
                member.setEnter_email_address(txtenter_email_address.getText().toString().trim());
                member.setEnter_password(txtenter_password.getText().toString().trim());
                member.setEnter_department(txtenter_department.getText().toString().trim());
                member.setEnter_district(txtenter_district.getText().toString().trim());
                member.setEnter_phone_number(txtenter_phone_number.getText().toString().trim());
                member.setEnter_full_name(txtEnter_full_name.getText().toString().trim());

                reff.push().setValue(member);
                Toast.makeText(employeeregisterpage.this, "Storage successful!",
                        Toast.LENGTH_LONG).show();


            }
        });
        options = new FirebaseRecyclerOptions.Builder<Construct>().setQuery(reff,Construct.class).build();
        adapter=new  FirebaseRecyclerAdapter<Construct, LoadHolder >(options){
            @NonNull
            @Override
            public LoadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.load_layout, parent, false);
                return new LoadHolder(v);
            }

            @Override
            protected void onBindViewHolder(@NonNull LoadHolder holder, int position, @NonNull Construct construct) {
                holder.name.setText(construct.getEnter_full_name());


            }


        };
  adapter.startListening();
  recyclerView.setAdapter(adapter);

    }


}
