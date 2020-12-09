package cl.dogbreed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
1. X Agregar dependencias y permisos
2. X Activar viewBinding
3.   Crear package modelo : los pojos y RetrofitClient
4.   Crear y diseñar Layout con ReciclerView
5.   Crear Clase presenter
6.   Crear clase adapter . viewHolder enlazar a ReciclerView
7.   Enlazar vista con Presenter
 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}