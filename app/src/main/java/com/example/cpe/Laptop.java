package com.example.cpe;

public class Laptop {
    private String laptop;

    public String getLaptop(){
        return laptop;
    }

    public void setLaptop(String Laptop) {
        this.laptop = Laptop;
    }

    String display() {
        return "Laptop : " + laptop;
    }

}
