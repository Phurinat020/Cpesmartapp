package com.example.cpe;

public class HeadPhone {
    private String headPhone;

    public String getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(String headPhone) {
        this.headPhone = headPhone;
    }

    String display() {
        return "HeadPhone : " + headPhone;
    }
}
