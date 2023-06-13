package com.ugb.proyecto_final;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragmentperson extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // No es necesario inflar ningún layout, ya que no se va a mostrar en esta vista

        // Iniciar la actividad lista_usuarios
        Intent intent = new Intent(getActivity(), MainActivity2.class);
        startActivity(intent);

        // Devolver null ya que no se va a mostrar ninguna vista en este fragmento
        return null;
    }
}