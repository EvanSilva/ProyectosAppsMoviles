package com.example.eligegiro;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtsaludar;
    float rotation;
    RadioGroup radioGroup;
    RadioButton rbimagen;
    Button btnAceptar;
    RadioGroup rbtexto;

    ImageButton imageButton;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtsaludar = findViewById(R.id.txtGiramos);
        radioGroup = findViewById(R.id.radioGroup);
        rbimagen = findViewById(R.id.rbImagen);
        rbtexto = findViewById(R.id.rbTexto);
        btnAceptar = findViewById(R.id.btnAceptar);
        imageButton = findViewById(R.id.imgImagenGone);


        imageButton.setVisibility(View.GONE);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbimagen.isChecked()) {

                    txtsaludar.setVisibility(View.GONE);

                    radioGroup.setVisibility(View.GONE);
                    btnAceptar.setVisibility(View.GONE);

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

                } else if (rbtexto.isChecked()) {
                    txtsaludar.setText("Has seleccionado la opción Texto.");

                    radioGroup.setVisibility(View.GONE);
                    btnAceptar.setVisibility(View.GONE);
                    imageButton.setVisibility(View.VISIBLE);

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if (rotation > 350){
                                rotation = 0;

                            } else {
                                rotation = rotation + 45;
                                imageButton.setRotation(rotation);
                            }

                        }
                    });


                }
            }
        });
    }
}