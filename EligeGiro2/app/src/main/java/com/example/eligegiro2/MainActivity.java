package com.example.eligegiro2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtsaludar;
    private float rotation;
    private RadioGroup radioGroup;
    private RadioButton rbimagen;
    private Button btnAceptar;
    private RadioButton rbtexto;
    private View layout;
    private EditText etGrados;

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
        layout = findViewById(R.id.layout);
        etGrados = findViewById(R.id.textedit);




        imageButton.setVisibility(View.GONE);

        try {

            btnAceptar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (rbtexto.isChecked()) {

                        Boolean isempty = etGrados.getText().toString().isEmpty();

                        if (isempty) {
                            Toast.makeText(MainActivity.this, "El campo está vacio", Toast.LENGTH_SHORT).show();
                            return;

                        } else {

                            int rotationFixed = Integer.parseInt(etGrados.getText().toString());

                            if (rotationFixed < 10 | rotationFixed > 100) {

                                Toast.makeText(MainActivity.this, "Los grados deben ser mas que 10 o menos que 100", Toast.LENGTH_SHORT).show();
                                return;

                            } else {

                                radioGroup.setVisibility(View.GONE);
                                btnAceptar.setVisibility(View.GONE);
                                etGrados.setVisibility(View.GONE);


                                txtsaludar.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        if (rotation > 360) {
                                            rotation = 0;

                                        } else {
                                            rotation = rotation + rotationFixed;
                                            txtsaludar.setText("HOLAAAAAAAAAAAA!!!!");
                                            txtsaludar.setRotation(rotation);
                                            txtsaludar.setBackgroundColor(getResources().getColor(R.color.cyan));
                                        }

                                    }
                                });
                            }
                        }

                    } else if (rbimagen.isChecked()) {

                        Boolean isempty = etGrados.getText().toString().isEmpty();

                        if (isempty) {
                            Toast.makeText(MainActivity.this, "El campo está vacio", Toast.LENGTH_SHORT).show();
                            return;

                        } else {


                            int rotationFixed = Integer.parseInt(etGrados.getText().toString());

                            if (rotationFixed < 10 | rotationFixed > 100) {

                                Toast.makeText(MainActivity.this, "Los grados deben ser mas que 10 o menos que 100", Toast.LENGTH_SHORT).show();

                            } else {

                                txtsaludar.setVisibility(View.GONE);
                                radioGroup.setVisibility(View.GONE);
                                btnAceptar.setVisibility(View.GONE);
                                imageButton.setVisibility(View.VISIBLE);
                                etGrados.setVisibility(View.GONE);

                                imageButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        if (rotation > 350) {
                                            rotation = 0;

                                        } else {
                                            rotation = rotation + rotationFixed;
                                            imageButton.setRotation(rotation);
                                        }

                                    }
                                });
                            }
                        }

                    }
                }
            });

        }catch (Exception e) {
            Toast.makeText(this, "Hay que introducir datos", Toast.LENGTH_SHORT).show();
        }


    }
}