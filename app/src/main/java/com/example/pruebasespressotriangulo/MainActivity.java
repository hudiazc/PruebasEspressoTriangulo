package com.example.pruebasespressotriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Lado1, Lado2, Lado3, textoResultado;
    private Button Ttriangulo;
    private Button Etriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lado1 = findViewById(R.id.Lado1);
        Lado2 = findViewById(R.id.Lado2);
        Lado3 = findViewById(R.id.Lado3);
        Ttriangulo = findViewById(R.id.Bresultado);
        textoResultado = findViewById(R.id.Tresultado);
        Etriangulo = findViewById(R.id.Bresultado2);

        Ttriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Lado11 = Integer.parseInt(Lado1.getText().toString());
                int Lado22 = Integer.parseInt(Lado2.getText().toString());
                int Lado33 = Integer.parseInt(Lado3.getText().toString());

                if ( Lado11==Lado22 && Lado22 == Lado33){
                    textoResultado.setText("Equilatero");
                }else if (Lado11 != Lado22 && Lado11 != Lado33 && Lado22 != Lado33){
                    textoResultado.setText("Escaleno");
                }else{
                    textoResultado.setText("isosceles");
                }
            }
        });
        Etriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Lado11 = Integer.parseInt(Lado1.getText().toString());
                int Lado22 = Integer.parseInt(Lado2.getText().toString());
                int Lado33 = Integer.parseInt(Lado3.getText().toString());

                if(Lado11+Lado22 > Lado33 && Lado11+Lado33 > Lado22 && Lado22+Lado33 > Lado11) {
                    textoResultado.setText("Es un triangulo");
                }else{
                    textoResultado.setText("No es un triangulo");
                }
            }
        });
    }
}