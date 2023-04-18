package com.example.martestp.ui.actividades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.martestp.R;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListaAdapter  extends ArrayAdapter<Actividades> {
    private LayoutInflater inflater;

    private Context context;

    private List<Actividades> actividades;



    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Actividades> objects, LayoutInflater inflater) {
        super(context, resource, objects);
        this.context=context;
        this.actividades=objects;
        this.inflater=inflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null){
            itemView=inflater.inflate(R.layout.item,parent,false);
        }
        Actividades act=actividades.get(position);
        LocalDateTime fecha = act.getFecha(); // O cualquier otra fecha que desees mostrar
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm a");
        String fechaNueva = fecha.format(formato);

        TextView t1=itemView.findViewById(R.id.tvActividad);
        t1.setText(act.getNomActividad());
        TextView t2=itemView.findViewById(R.id.tvFecha);
        t2.setText(fechaNueva);
        return itemView;
    }
}
