package com.example.cuentaclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvRespuesta;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnpulsame;
        tvRespuesta = findViewById(R.id.tvRespuesta);

        btnpulsame = findViewById(R.id.btnPulsame);
        btnpulsame.setOnClickListener(escuchador2);




    }

    private View.OnClickListener escuchador2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            counter++;
            tvRespuesta.setText("Has pulsado el botón " + counter + " veces");
        }
    };

}