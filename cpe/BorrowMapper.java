package com.example.cpe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class BorrowMapper {

    static Gson gson = new Gson();

    // OOP -> Entity
    public static BorrowEntity toEntity(SignToBorrow borrow) {
        if (borrow instanceof BorrowLaptop) {
            return new BorrowEntity(borrow.userBorrow.getName(), "Laptop", ((BorrowLaptop) borrow).getLaptopName(), null, null, borrow.borrowDate);
        }
        else if (borrow instanceof BorrowIpad) {
            String jsonItems = gson.toJson(((BorrowIpad) borrow).getIpadName());
            return new BorrowEntity(borrow.userBorrow.getName(), "Ipad", null, jsonItems, null, borrow.borrowDate);
        }
        else if (borrow instanceof BorrowHeadPhone) {
            String jsonItems = gson.toJson(((BorrowHeadPhone) borrow).getHeadPhoneName());
            return new BorrowEntity(borrow.userBorrow.getName(), "HeadPhone", null, null, jsonItems, borrow.borrowDate);
        }
        return null;
    }

    // Entity -> OOP
    public static SignToBorrow fromEntity(BorrowEntity entity) {
        if (entity.type.equals("laptop")) {
            return new BorrowLaptop(entity.userBorrow, entity.createdDate, entity.LaptopNameJson);
        }
        else if (entity.type.equals("ipad")) {
            return new BorrowIpad(entity.userBorrow, entity.createdDate, entity.ipadNameJson);
        }
        else if (entity.type.equals("headPhone")) {
            return new BorrowHeadPhone(entity.userBorrow, entity.createdDate, entity.headPhoneNameJson);
        }
        return null;
    }
}
