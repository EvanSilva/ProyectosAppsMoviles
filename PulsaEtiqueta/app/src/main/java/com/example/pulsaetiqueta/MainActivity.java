package com.example.pulsaetiqueta;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtsaludar;
    float rotation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtsaludar = findViewById(R.id.saludar);

        txtsaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rotation > 350){
                    rotation = 0;

                } else {
                rotation = rotation + 45;
                txtsaludar.setText("HOLAAAAAAAAAAAA!!!!");
                txtsaludar.setRotation(rotation);
                txtsaludar.setBackgroundColor(getResources().getColor(R.color.cyan));
                }

            }
        });


    }
}