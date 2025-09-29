package com.example.cpe;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

public class YurmHeadPhoneActivity extends AppCompatActivity {

    Spinner listHeadPhone;
    Button confirm, backButton;
    EditText name, studentId, phoneNumber;
    TextView display;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_yurm_head_phone);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listHeadPhone = findViewById(R.id.spinner3);

        String[] ipads = {"Artix CL750", "Symphonized Blast", "Sony", "Logitech"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, ipads);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listHeadPhone.setAdapter(adapter);

        name = findViewById(R.id.editTextText9);
        studentId = findViewById(R.id.editTextText8);
        phoneNumber = findViewById(R.id.editTextText7);
        confirm = findViewById(R.id.button11);
        display = findViewById(R.id.textView22);

        confirm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"MissingPermission", "NotificationPermission"})
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Id = studentId.getText().toString();
                String stringOfPhone = phoneNumber.getText().toString();
                Date currentDate = new Date();

                User user = new User(Name);
                User userId = new User(Id);
                String HeadPhoneName = listHeadPhone.getSelectedItem().toString();

                BorrowHeadPhone headPhone = new BorrowHeadPhone();
                headPhone.setUserBorrow(user);
                headPhone.setUserId(userId);
                headPhone.setPhoneNumber(stringOfPhone);
                headPhone.borrowDate = currentDate;

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.DATE, 5);
                Date returnDate = calendar.getTime();
                headPhone.returnDate = returnDate;

                headPhone.setHeadPhoneName(HeadPhoneName);

                display.setText(headPhone.display());

                new AlertDialog.Builder(YurmHeadPhoneActivity.this)
                        .setTitle("ข้อมูลการยืมหูฟัง")
                        .setMessage(display.getText().toString())
                        .setPositiveButton("ตกลง", null)
                        .show();
            }
        });

        backButton = findViewById(R.id.button10);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back");
                Intent yurmActivity = new Intent(getApplicationContext(), YurmUbPaGornActivity.class);
                startActivity(yurmActivity);
            }
        });

    }
}