package com.example.eventos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvRespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRespuesta = findViewById(R.id.tvRespuesta);
    }

    int no = R.id.btnno;
    int si = R.id.btnsi;
    int aveces = R.id.btnsometimes;

    public void onClickBotns(View view) {

        switch (view.getId()) {
            case (R.id.btnsi):
                tvRespuesta.setText("Has pulsado el botón Sí");
                break;
            case (R.id.btnno):
                tvRespuesta.setText("Has pulsado el botón no");
                break;
            case (R.id.btnsometimes):
                tvRespuesta.setText("Has pulsado el botón A veces");
                break;
        }


        /*
        if (view.getId() == R.id.btnsi){
            tvRespuesta.setText("Has pulsado el botón Sí");
        } else if (view.getId() == R.id.btnno) {
            tvRespuesta.setText("Has pulsado el botón no");
        } else if (view.getId() == R.id.btnsometimes) {
            tvRespuesta.setText("Has pulsado el botón A veces");
        }
         */
    }

}