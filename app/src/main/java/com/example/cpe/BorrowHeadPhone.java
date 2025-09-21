package com.example.cpe;

import java.util.Date;

public class BorrowHeadPhone extends SignToBorrow{
    private String headPhoneName;
    public Date returnDate;

    public String getHeadPhoneName() {
        return headPhoneName;
    }

    public void setHeadPhoneName(String selectHeadPhone) {
        this.headPhoneName = selectHeadPhone;
    }

    String display() {
        return "Name : " + (userBorrow != null ? userBorrow.getName() : "Unknow") +
                "\nStudentId : " + (userId != null ? userId.getName() : "Unknow") +
                "\nPhone : " + phoneNumber +
                "\nHeadPhone : " + headPhoneName +
                "\nDate : " + borrowDate +
                "\nReturn Due : " + returnDate;
    }
}
