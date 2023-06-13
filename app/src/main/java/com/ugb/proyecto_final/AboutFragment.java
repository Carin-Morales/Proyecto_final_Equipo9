package com.ugb.proyecto_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class AboutFragment extends Fragment {

Button hithub;

private final  static String GitHub_URL = "https://github.com/Carin-Morales/Proyecto_final_Equipo9";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        hithub = view.findViewById(R.id.botongit);
        hithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                // Acciones a realizar cuando se hace clic en el botón

                switch (v.getId()) {
                    case R.id.botongit:

                        intent.setData(Uri.parse(GitHub_URL));
                        startActivity(intent);

                        break;
                }


                if (v == hithub) {
                    // Lógica para abrir el enlace de GitHub
                    // Puedes usar una intención para abrir una URL en el navegador
                }
            }
        });

        return view;
    }
}