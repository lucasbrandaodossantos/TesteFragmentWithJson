package com.example.lucas.testefragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragEventos fragEventos = new FragEventos();
        FragmentManager fragmentManager_eventos = getSupportFragmentManager();
        fragmentManager_eventos.beginTransaction().replace(R.id.cl_eventos, fragEventos).commit();

    }
}
