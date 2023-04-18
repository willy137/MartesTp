package com.example.martestp.ui.actividades;

import android.app.Application;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.martestp.R;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class MisActividadesViewModel extends AndroidViewModel {
    // TODO: Implement the ViewModel
    private ArrayList<Actividades> act=new ArrayList<>();

    public MisActividadesViewModel(@NonNull Application application) {
        super(application);
    }

    public ArrayList<Actividades> cargarDatos(){
        act.clear();
        act.add(new Actividades("Yoga","actividad física y mental que se originó en la India hace más de 5.000 años. Consiste en una serie de posturas " +
                "o asanas, que se combinan con técnicas de respiración y meditación para ayudar a mejorar " +
                "la salud y el bienestar del cuerpo y la mente.", LocalDateTime.of(2023, 4, 19, 14, 30),"Dos venados, avenida gilberto funes"));
        act.add(new Actividades("Karate","es una arte marcial moderna originada en Japón que se enfoca en técnicas de golpes, patadas, bloqueos, barridos, derribos y " +
                "técnicas de inmovilización. El entrenamiento en Karate también incluye " +
                "trabajo de acondicionamiento físico, flexibilidad, resistencia y habilidades de respiración.", LocalDateTime.of(2023, 4, 30, 18, 30),"Parque de las naciones, entrada riobamba"));
        act.add(new Actividades("Breakdance","es una forma de danza urbana que se originó en los barrios " +
                "de la ciudad de Nueva York durante la década de 1970.", LocalDateTime.of(2023, 4, 25, 20, 00),"Anfiteatro España calle moron 1423 "));
        act.add(new Actividades("MicroEmprendimientos","es un programa de formación que tiene " +
                "como objetivo ayudar a los emprendedores a establecer y gestionar sus propios negocios", LocalDateTime.of(2023, 6, 10, 10, 00),"Barrio La merced manzana 1 casa 30"));
        return act;
    }

}