package com.example.saludopersonalizado;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         TextView tvNombre, tvMayoredad, tvDespedida, tvTituloDespedida;
         EditText etNombre, etAño;
         Button btSaludar;
         RadioButton rbSeñor, rbSeñora, rbAdios, rbHastaPronto;
         CheckBox chkDespedida;
         RadioGroup rgDespedida;


        etAño = findViewById(R.id.etAñoNacimiento);
        etNombre = findViewById(R.id.etNombre);

        btSaludar = findViewById(R.id.btnSaludar);
        tvNombre = findViewById(R.id.tvSaludo);
        tvMayoredad = findViewById(R.id.tvMayorEdad);
        tvDespedida =  findViewById(R.id.tvDespedida);
        tvTituloDespedida =  findViewById(R.id.tvTituloTiposDespedida);

        rbAdios =  findViewById(R.id.rbAdios);
        rbHastaPronto =  findViewById(R.id.rbHastaPronto);
        rbSeñor = findViewById(R.id.rbSeñor);
        rbSeñora = findViewById(R.id.rbSeñora);

        chkDespedida = findViewById(R.id.chkDespedida);

        rgDespedida = findViewById(R.id.rgTiposDespedida);



        int AÑOACTUAL = 2024;

        chkDespedida.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){

                    tvTituloDespedida.setVisibility(View.VISIBLE);
                    rgDespedida.setVisibility(View.VISIBLE);

                } else {

                    tvTituloDespedida.setVisibility(View.GONE);
                    rgDespedida.setVisibility(View.GONE);

                }

            }
        });


        btSaludar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Boolean etAñoIsEmpty = etAño.getText().toString().isEmpty();
                Boolean etNombreIsEmpty = etNombre.getText().toString().isEmpty();

                if (etAñoIsEmpty | etNombreIsEmpty ) {

                    Toast.makeText(MainActivity.this, "Faltan datos", Toast.LENGTH_SHORT).show();
                    return;

                } else {

                    String textoAño = etAño.getText().toString();
                    String textoNombre = etNombre.getText().toString();
                    int edadActual = AÑOACTUAL - Integer.parseInt(textoAño);

                    if (rbSeñor.isChecked()) {
                        tvNombre.setText("Sr. " + textoNombre);
                    } else {
                        tvNombre.setText("Sra. " + textoNombre);
                    }

                    if ( edadActual >= 18 ) {

                        tvMayoredad.setText("Eres mayor de edad");

                    } else {

                        tvMayoredad.setText("Eres MENOR de edad!!!!");

                    }

                    if (chkDespedida.isChecked()) {

                        tvDespedida.setVisibility(View.VISIBLE);

                        if (rbAdios.isChecked()) {

                            tvDespedida.setText("Adios");

                        } else if (rbHastaPronto.isChecked()) {

                            tvDespedida.setText("HastaPronto");

                        } else {

                            Toast.makeText(MainActivity.this, "Selecciona el tipo de despedida", Toast.LENGTH_SHORT).show();

                        }

                    } else {
                        tvDespedida.setVisibility(View.GONE);
                    }

                }

            }
        });

    }
}