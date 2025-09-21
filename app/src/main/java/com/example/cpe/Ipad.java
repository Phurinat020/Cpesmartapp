package com.example.cpe;

public class Ipad {
    private String ipad;

    public static void setIpadName(String ipadName) {
    }

    public String getIpad() {
        return ipad;
    }

    public void setIpad(String ipad) {
        this.ipad = ipad;
    }

    String display() {
        return "Ipad : " + ipad;
    }

}
