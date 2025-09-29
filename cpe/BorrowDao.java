package com.example.cpe;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BorrowDao {

    @Insert
    void insert(BorrowEntity borrow);

    @Query("SELECT * FROM borrows ORDER BY createdDate DESC")
    List<BorrowEntity> getAll();

    @Delete
    void delete(BorrowEntity borrow);
}

