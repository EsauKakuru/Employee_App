package com.materialdesign.employeeapp;

public class Member {
    private String Enter_full_name, enter_email_address, enter_password,
            enter_district, enter_department,
            enter_phone_number;

    public Member() {
    }

    public String getEnter_full_name() {
        return Enter_full_name;
    }

    public void setEnter_full_name(String enter_full_name) {
        Enter_full_name = enter_full_name;
    }

    public String getEnter_email_address() {
        return enter_email_address;
    }

    public void setEnter_email_address(String enter_email_address) {
        this.enter_email_address = enter_email_address;
    }

    public String getEnter_password() {
        return enter_password;
    }

    public void setEnter_password(String enter_password) {
        this.enter_password = enter_password;
    }

    public String getEnter_district() {
        return enter_district;
    }

    public void setEnter_district(String enter_district) {
        this.enter_district = enter_district;
    }

    public String getEnter_department() {
        return enter_department;
    }

    public void setEnter_department(String enter_department) {
        this.enter_department = enter_department;
    }

    public String getEnter_phone_number() {
        return enter_phone_number;
    }

    public void setEnter_phone_number(String enter_phone_number) {
        this.enter_phone_number = enter_phone_number;
    }
}

