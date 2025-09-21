package com.example.cpe;

public class BorrowIpad extends SignToBorrow{
    private String ipadName;

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
                "\nDate : " + borrowDate;
    }
}
