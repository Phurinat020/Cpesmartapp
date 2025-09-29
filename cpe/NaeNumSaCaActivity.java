package com.example.cpe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class NaeNumSaCaActivity extends AppCompatActivity {

    Button backToFuture;
    TextView linkBotton, linkBotton2;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nae_num_sa_ca);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backToFuture = findViewById(R.id.button3);
        backToFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back");
                Intent futureActivity = new Intent(getApplicationContext(), FutureActivity.class);
                startActivity(futureActivity);
            }
        });

        linkBotton = findViewById(R.id.textView16);
        linkBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Open link");
                String url = "https://cpe.psru.ac.th/history/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        linkBotton2 = findViewById(R.id.textView19);
        linkBotton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Open link");
                String url = "https://www.youtube.com/watch?v=ZEGpWo7ethQ&list=RDZEGpWo7ethQ&start_radio=1";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}