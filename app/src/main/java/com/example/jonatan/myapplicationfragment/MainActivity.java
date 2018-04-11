package com.example.jonatan.myapplicationfragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentDetalleNumero.OnFragmentInteractionListener,
        FragmentList.OnFragmentInteractionListener, IComunicaFragments {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void enviarNumero(String numero) {
        FragmentDetalleNumero fragmentDetalleNumero = new FragmentDetalleNumero();
        Bundle paquete=new Bundle();
        paquete.putString("numero",numero);
        fragmentDetalleNumero.setArguments(paquete);

        //cargo el fragment en el Activity
        getSupportFragmentManager().beginTransaction().
                replace(R.id.idFragmentNumero,fragmentDetalleNumero).
                addToBackStack(null).commit();
    }
}
