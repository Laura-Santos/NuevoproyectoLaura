package com.example.sqlite;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    TextView tvNombre, tvRedSocial, tvCel, tvDireccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_personales);

        tvNombre = findViewById(R.id.tvnombre);
        tvRedSocial = findViewById(R.id.tvred);
        tvCel = findViewById(R.id.tvcel);
        tvDireccion = findViewById(R.id.tvdireccion);

        informacion();
    }

    public void informacion (){

        tvNombre.setText("Laura Lorena Santos García");
        tvRedSocial.setText("Facebook: Laura Santos");
        tvCel.setText("7642-9262");
        tvDireccion.setText("Santiago Nonualco,La Paz.");

    }
}