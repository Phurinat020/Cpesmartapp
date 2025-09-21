package com.example.cpe;

public class BorrowLaptop extends SignToBorrow{
    private String laptopName;

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
                "\nDate : " + borrowDate;
    }
}
