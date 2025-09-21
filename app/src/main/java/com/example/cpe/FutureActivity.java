package com.example.cpe;

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

public class FutureActivity extends AppCompatActivity {

    ImageButton naeNumSaCa;
    ImageButton neaNumViCha;
    ImageButton project;
    ImageButton yurmUbPaGorn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_future);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        naeNumSaCa = findViewById(R.id.imageButton);
        neaNumViCha = findViewById(R.id.imageButton2);
        project = findViewById(R.id.imageButton3);
        yurmUbPaGorn = findViewById(R.id.imageButton4);

        naeNumSaCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                Intent naeNumSaCaActivity = new Intent(getApplicationContext(), NaeNumSaCaActivity.class);
                startActivity(naeNumSaCaActivity);
            }
        });
        neaNumViCha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                Intent naeNumViChaActivity = new Intent(getApplicationContext(), NaeNumViChaActivity.class);
                startActivity(naeNumViChaActivity);
            }
        });
        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                Intent projectActivity = new Intent(getApplicationContext(), ProjectActivity.class);
                startActivity(projectActivity);
            }
        });
        yurmUbPaGorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                Intent yurmUbPaGornActivity = new Intent(getApplicationContext(), YurmUbPaGornActivity.class);
                startActivity(yurmUbPaGornActivity);
            }
        });

    }
}