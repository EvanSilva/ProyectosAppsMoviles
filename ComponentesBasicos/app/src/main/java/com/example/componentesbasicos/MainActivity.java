package com.example.componentesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
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

    private TextView tvRespuesta ;
    private CheckBox chkWindows, chkLinux, chkOtros;
    private ImageButton imageButton;
    private RadioGroup rgRespuesta;
    private RadioButton rbSi, rbNo, rbNsNc;
    private EditText etSumando1, etSumando2;
    private Button btnSumar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarListas();


        // LISTENER DEL BOTON SUMAR
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    int sumando1 = Integer.parseInt(etSumando1.getText().toString());
                    int sumando2 = Integer.parseInt(etSumando2.getText().toString());

                    Integer resultado = sumando1 + sumando2;
                    tvRespuesta.setText(resultado.toString());

                } catch (Exception e)  {
                    Toast.makeText(MainActivity.this, "Faltan parámetros por introducir", Toast.LENGTH_LONG).show();

                }



            }
        });


        // Listener para el evento onCheckedChange (Sobre chkOtros)
        chkOtros.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischeked) {

                if (ischeked) {
                    imageButton.setVisibility(View.VISIBLE);
                } else {
                    imageButton.setVisibility(View.GONE);
                }

            }
        });

        rgRespuesta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == R.id.rb_si) {

                    tvRespuesta.setText("Sí seleccionado");

                } else if ((checkedId == R.id.rb_no)) {

                    tvRespuesta.setText("Sí seleccionado");

                } else if(checkedId == R.id.rb_nsnc) {

                    tvRespuesta.setText("Sí seleccionado");

                }

            }
        });


        // Listener para el evento chkWindows
        chkWindows.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (chkWindows.isChecked()) {
                    tvRespuesta.setText("Checkbox Windows Selecionado");
                } else {
                    tvRespuesta.setText("Checkbox Windows NO Selecionado");

                }
            }
        });


        // Listener para el evento chkLinux
        chkLinux.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (((CheckBox)view).isChecked()) {
                    tvRespuesta.setText("Checkbox Linux Selecionado");
                } else {
                    tvRespuesta.setText("Checkbox Linux NO Selecionado");

                }
            }
        });




    } // end create

    private void inicializarListas() {
        tvRespuesta = findViewById(R.id.tvRespuesta);
        chkWindows = findViewById(R.id.chkWindows);
        chkLinux = findViewById(R.id.chkLinux);
        chkOtros = findViewById(R.id.chkOtros);
        imageButton = findViewById(R.id.imgGone);
        rgRespuesta = findViewById(R.id.rgRespuesta);
        rbSi = findViewById(R.id.rb_si);
        rbNo = findViewById(R.id.rb_no);
        rbNsNc = findViewById(R.id.rb_nsnc);
        btnSumar = findViewById(R.id.btnBotonSuma);
        etSumando1 = findViewById(R.id.etSumando1);
        etSumando2 = findViewById(R.id.etSumando2);

    }

} // end main