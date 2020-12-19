package com.materialdesign.employeeapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LoadHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView department;

    public LoadHolder(@NonNull View itemView) {
        super(itemView);
        name= (TextView) itemView.findViewById(R.id.name);
        department= (TextView) itemView.findViewById(R.id.department);
    }
}
