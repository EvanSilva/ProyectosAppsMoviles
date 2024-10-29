package com.example.cuentaclicksmejorado;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnPulsame, btnFinalizar, btnReset;
    TextView tvRespuesta;
    int contador = 0;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRespuesta = findViewById(R.id.tvRespuesta);


        btnPulsame = findViewById(R.id.btnPulsame);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnReset = findViewById(R.id.btnReset);

        btnPulsame.setOnClickListener(escuchador1);

        Auxiliar escuchadorAuxiliar =  new Auxiliar();
        btnFinalizar.setOnClickListener(escuchadorAuxiliar);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = 0;
            }
        });

    }

    private class Auxiliar implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            tvRespuesta.setText("Has pulsado " + contador + " veces");

        }
    }// end clase auxiliar


    private View.OnClickListener escuchador1 = new View.OnClickListener() {

        @Override
        public void onClick(View view) {

            contador++;

        }
    };

}