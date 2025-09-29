package com.example.cpe;

import java.util.Date;

public abstract class SignToBorrow {
    protected String phoneNumber;
    Date borrowDate;
    protected User userBorrow, userId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String inputphone) {
        this.phoneNumber = inputphone;
    }

    public User getUserBorrow() {
        return userBorrow;
    }

    public void setUserBorrow(User userBorrow) {
        this.userBorrow = userBorrow;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    abstract String display();
}
