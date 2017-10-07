package com.example.android.personas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listado_Listview extends AppCompatActivity {

private ListView lista;
    private ArrayList<Persona> personas;
    private Context contexto;
    private AdaptadorPersona adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado__listview);

        lista= (ListView)findViewById(R.id.lstListadoPersona);
        contexto = this.getApplicationContext();
        personas=Datos.obtenerPersonas();
        adapter=new AdaptadorPersona(contexto,personas);
        lista.setAdapter(adapter);

    }
}
