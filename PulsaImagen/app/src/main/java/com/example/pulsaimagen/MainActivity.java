package com.example.pulsaimagen;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    float rotation;
    ImageView imagenfondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenfondo = findViewById(R.id.imagenfondo);

        imagenfondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rotation = rotation + 45;
                imagenfondo.setRotation(rotation);

            }
        });



    }

}