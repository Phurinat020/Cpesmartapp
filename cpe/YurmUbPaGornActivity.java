package com.example.cpe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class YurmUbPaGornActivity extends AppCompatActivity {

    Button backToFuture;
    ImageButton laptop, ipad, headPhones;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_yurm_ub_pa_gorn);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backToFuture = findViewById(R.id.button5);
        backToFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back");
                Intent futureActivity = new Intent(getApplicationContext(), FutureActivity.class);
                startActivity(futureActivity);
            }
        });

        laptop = findViewById(R.id.imageButton5);
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Laptop");
                Intent laptopActivity = new Intent(getApplicationContext(), YurmLaptopActivity.class);
                startActivity(laptopActivity);
            }
        });

        ipad = findViewById(R.id.imageButton6);
        ipad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Ipad");
                Intent ipadActivity = new Intent(getApplicationContext(), YurmIpadActivity.class);
                startActivity(ipadActivity);
            }
        });

        headPhones = findViewById(R.id.imageButton7);
        headPhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("HeadPhone");
                Intent HeadPhoneActivity = new Intent(getApplicationContext(), YurmHeadPhoneActivity.class);
                startActivity(HeadPhoneActivity);
            }
        });
    }
}