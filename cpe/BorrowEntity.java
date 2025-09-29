package com.example.cpe;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "borrows")
public class BorrowEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    public String userBorrow;

    @NonNull
    public String type; // "text" หรือ "checklist"

    public String LaptopNameJson; // null ถ้าไม่ใช่ laptop
    public String ipadNameJson; // null ถ้าไม่ใช่ ipad
    public String headPhoneNameJson; // null ถ้าไม่ใช่ headPhone

    public Date createdDate;

    public BorrowEntity(@NonNull String userBorrow, @NonNull String type, String LaptopNameJson, String ipadNameJson, String headPhoneNameJson, Date createdDate) {
        this.userBorrow = userBorrow;
        this.type = type;
        this.LaptopNameJson = LaptopNameJson;
        this.ipadNameJson = ipadNameJson;
        this.headPhoneNameJson = headPhoneNameJson;
        this.createdDate = createdDate;
    }
}

