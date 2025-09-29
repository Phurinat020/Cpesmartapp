package com.example.cpe;

import java.util.Date;

public class BorrowIpad extends SignToBorrow{
    private String ipadName;
    public Date returnDate;

    public BorrowIpad(String userBorrow, Date createdDate, String ipadNameJson) {

    }

    public BorrowIpad() {

    }

    public String getIpadName() {
        return ipadName;
    }

    public void setIpadName(String selectipad) {
        this.ipadName = selectipad;
    }

    String display() {
        return "Name : " + (userBorrow != null ? userBorrow.getName() : "Unknow") +
                "\nStudentId : " + (userId != null ? userId.getName() : "Unknow") +
                "\nPhone : " + phoneNumber +
                "\nIpad : " + ipadName +
                "\nDate : " + borrowDate +
                "\nReturn Date : " + returnDate;
    }
}
