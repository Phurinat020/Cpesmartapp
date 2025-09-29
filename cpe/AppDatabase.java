package com.example.cpe;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {BorrowEntity.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract BorrowDao borrowDao();

    private static volatile AppDatabase INSTANCE;
    public static final String FORCE_COMPILE = "trigger Room compiler";


    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            Log.i("AppDatabase","AAAAAA");
            INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "note_database"
                    )
                    .build();
        }
        return INSTANCE;
    }

}
