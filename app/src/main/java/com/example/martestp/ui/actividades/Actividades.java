package com.example.martestp.ui.actividades;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Actividades implements Serializable {
/*Mostrará una lista de actividades
y al seleccionar una de ellas navegará a otro fragment mostrando más detalle de la misma.
 Sabiendo que una actividad tiene información accera de: nombre de la actividad, una descripción de la misma, fecha, hora y lugar.
  Mostrando sólo nombre, fecha y hora en la lista y el resto de la información en el fragment de detalle.
 */
    private String nomActividad;
    private String descrip;
    private LocalDateTime fecha;
    private String lugar;

    public Actividades(){

    }

    public Actividades(String nomActividad, String descrip, LocalDateTime fecha, String lugar) {
        this.nomActividad = nomActividad;
        this.descrip = descrip;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getNomActividad() {
        return nomActividad;
    }

    public void setNomActividad(String nomActividad) {
        this.nomActividad = nomActividad;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
