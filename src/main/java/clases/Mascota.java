package clases;

import enumn.TipoMascota;
import enumn.TipoServicio;

import java.security.Provider;

public class Mascota {

    private String name;
    private int edad;
    private TipoMascota tipoMascota;
    private Servicio servicio;

    public Mascota(String name, int edad, TipoMascota tipoMascota, Servicio servicio) {
        this.name = name;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.servicio = servicio;
    }

    public void createService(TipoServicio tipoServicio, float price){
        this.servicio = new Servicio(tipoServicio, price);

    }

    @Override
    public String toString() {
        return "Mascota{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", tipoMascota=" + tipoMascota +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
}
