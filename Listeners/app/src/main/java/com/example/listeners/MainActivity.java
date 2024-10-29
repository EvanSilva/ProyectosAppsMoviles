package com.example.listeners;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btnClaseAuxiliar, btnClaseAnonima, btn3en1, btnimplements;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRespuesta = findViewById(R.id.tvRespuesta);
        btnClaseAuxiliar = findViewById(R.id.btnauxiliar);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btn3en1 = findViewById(R.id.btn_3en1);
        btnimplements = findViewById(R.id.btnimplements);



        // CREAR UN OBJETO DE LA CLASE AUXILIAR
        Auxiliar escuchador1 =  new Auxiliar();


        btnClaseAuxiliar.setOnClickListener(escuchador1);


        btnClaseAnonima.setOnClickListener(escuchador2);

         /*
        MÉTODO 3
        OBJETO ESCUCHADOR MEDIANTE UNA CLASE ANÓNIMA
         */

        btn3en1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvRespuesta.setText("Botón tres en uno");
            }
        });




        btnimplements.setOnClickListener(this);


    } // end oncreate


    /*
    MÉTODO 1
    CREAR UNA CLASE INTERNA AUXILIAR PARA IMPLEMENTAR EL ESCUCHADOR
     */

    private class Auxiliar implements View.OnClickListener{


        @Override
        public void onClick(View view) {

            tvRespuesta.setText("Botón clase interna pulsado");

        }
    }// end clase auxiliar


     /*
    MÉTODO 2
    OBJETO ESCUCHADOR MEDIANTE UNA CLASE ANÓNIMA
     */

    private View.OnClickListener escuchador2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            tvRespuesta.setText("Botón clase anónima pulsado");

        }
    };


    TextView tvRespuesta;

    @Override
    public void onClick(View view) {
        tvRespuesta.setText("Botón clase implements pulsado");
    }



} // end MainActivity