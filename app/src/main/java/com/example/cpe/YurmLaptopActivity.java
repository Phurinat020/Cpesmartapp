package com.example.cpe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

import java.util.Arrays;
import java.util.Date;

public class YurmLaptopActivity extends AppCompatActivity {

    Spinner listLaptop;
    Button confirm, backButton;
    EditText name, studentId, phoneNumber;
    Date borrowingDate;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_yurm_laptop);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listLaptop = findViewById(R.id.spinner);

        String[] laptops = {"LaptopAsus", "LaptopMsi", "MacBook", "LaptopAser"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, laptops);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listLaptop.setAdapter(adapter);

        name = findViewById(R.id.editTextText);
        studentId = findViewById(R.id.editTextText2);
        phoneNumber = findViewById(R.id.editTextText3);
        confirm = findViewById(R.id.button7);
        display = findViewById(R.id.textView20);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Id = studentId.getText().toString();
                String stringOfPhone = phoneNumber.getText().toString();
                Date currentDate = new Date();

                User user = new User(Name);
                User userId = new User(Id);
                String LaptopName = listLaptop.getSelectedItem().toString();

                BorrowLaptop laptop = new BorrowLaptop();
                laptop.setUserBorrow(user);
                laptop.setUserId(userId);
                laptop.setPhoneNumber(stringOfPhone);
                laptop.borrowDate = currentDate;

                laptop.setLaptopName(LaptopName);

                display.setText(laptop.display());
            }
        });

        backButton = findViewById(R.id.button6);
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