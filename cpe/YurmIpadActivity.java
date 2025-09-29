package com.example.cpe;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

public class YurmIpadActivity extends AppCompatActivity {

    Spinner listIpad;
    Button confirm, backButton;
    EditText name, studentId, phoneNumber;
    Date borrowingDate;
    TextView display;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_yurm_ipad);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listIpad = findViewById(R.id.spinner2);

        String[] ipads = {"IpadAir4", "IpadAir5", "IpadAir6", "IpadAir7"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, ipads);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listIpad.setAdapter(adapter);

        name = findViewById(R.id.editTextText5);
        studentId = findViewById(R.id.editTextText6);
        phoneNumber = findViewById(R.id.editTextText4);
        confirm = findViewById(R.id.button9);
        display = findViewById(R.id.textView15);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Id = studentId.getText().toString();
                String stringOfPhone = phoneNumber.getText().toString();
                Date currentDate = new Date();

                User user = new User(Name);
                User userId = new User(Id);
                String IpadName = listIpad.getSelectedItem().toString();

                BorrowIpad ipad = new BorrowIpad();
                ipad.setUserBorrow(user);
                ipad.setUserId(userId);
                ipad.setPhoneNumber(stringOfPhone);
                ipad.borrowDate = currentDate;

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.DATE, 5);
                Date returnDate = calendar.getTime();
                ipad.returnDate = returnDate;

                ipad.setIpadName(IpadName);

                display.setText(ipad.display());

                new AlertDialog.Builder(YurmIpadActivity.this)
                        .setTitle("ข้อมูลการยืมไอแพด")
                        .setMessage(display.getText().toString())
                        .setPositiveButton("ตกลง", null)
                        .show();
            }
        });

        backButton = findViewById(R.id.button8);
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