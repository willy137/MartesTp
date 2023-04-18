package com.example.martestp.ui.actividades;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.martestp.R;

import java.util.ArrayList;

public class MisActividadesFragment extends Fragment {

    private MisActividadesViewModel mViewModel;

    private ArrayList<Actividades> listaActividades=new ArrayList<>();

    public static MisActividadesFragment newInstance() {
        return new MisActividadesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_mis_actividades, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MisActividadesViewModel.class);
        listaActividades = mViewModel.cargarDatos();
        listView(root);

        return root;
    }
    public void listView(View view){
        ArrayAdapter<Actividades> adapter=new ListaAdapter(getContext(), R.layout.item,listaActividades,getLayoutInflater());
        ListView lv=view.findViewById(R.id.lvActividades);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Actividades act=listaActividades.get(position);
                Bundle bundle=new Bundle();
                bundle.putSerializable("actividad", act);
                Navigation.findNavController(getActivity(),R.id.nav_host_fragment_content_main).navigate(R.id.nav_detalles,bundle);
            }
        });

    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MisActividadesViewModel.class);
        // TODO: Use the ViewModel
    }

}