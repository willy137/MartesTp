package com.example.martestp.ui.actividades;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.martestp.R;
import com.example.martestp.databinding.FragmentDetallesBinding;
import com.example.martestp.model.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DetallesFragment extends Fragment {
    private Intent intent;

    private LayoutInflater inflater;
    private FragmentDetallesBinding binding;

    public static MisActividadesFragment newInstance() {
        return new MisActividadesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding=FragmentDetallesBinding.inflate(inflater, container, false);
        View root=binding.getRoot();
        Bundle actividad=getArguments();
        Actividades act= (Actividades) actividad.getSerializable("actividad");
        cargarDatos(act);
        return root;
    }

    private void cargarDatos(Actividades actividades) {
        LocalDateTime fecha = actividades.getFecha(); // O cualquier otra fecha que desees mostrar
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm a");
        String fechaNueva = fecha.format(formato);
        binding.tvNomActi.setText(actividades.getNomActividad());
        binding.tvDescrip.setText(actividades.getDescrip());
        binding.tvFech.setText(fechaNueva);
        binding.tvLugar.setText(actividades.getLugar());

    }

}