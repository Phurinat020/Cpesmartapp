package com.example.cpe;

import java.util.Date;

public class BorrowLaptop extends SignToBorrow{
    private String laptopName;
    public Date returnDate;

    public BorrowLaptop(String userBorrow, Date createdDate, String laptopNameJson) {
        super();
    }

    public BorrowLaptop() {

    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String selectLaptop) {
        this.laptopName = selectLaptop;
    }

    String display() {
        return "Name : " + (userBorrow != null ? userBorrow.getName() : "Unknow") +
                "\nStudentId : " + (userId != null ? userId.getName() : "Unknow") +
                "\nPhone : " + phoneNumber +
                "\nLaptop : " + laptopName +
                "\nDate : " + borrowDate +
                "\nReturn Date : " + returnDate;
    }
}
