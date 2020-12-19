package com.materialdesign.employeeapp;

public class Construct {
    private String Enter_full_name,
             enter_department;

    public Construct() {
    }

    public Construct(String enter_full_name,
                     String enter_department) {
        Enter_full_name = enter_full_name;
        this.enter_department = enter_department;
    }

    public String getEnter_full_name() {

        return Enter_full_name;
    }

    public void setEnter_full_name(String enter_full_name) {
        Enter_full_name = enter_full_name;
    }


    public String getEnter_department() {

        return enter_department;
    }

    public void setEnter_department(String enter_department) {
        this.enter_department = enter_department;
    }

}
