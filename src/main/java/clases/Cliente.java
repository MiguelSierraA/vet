package clases;


import enumn.TipoMascota;
import enumn.TipoServicio;

import java.security.Provider;

public class Cliente {

    private String name;
    private String address;
    private Long telephone;
    private Mascota mascota;

    public Cliente(String name, String address, Long telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mascota = mascota;
    }


    public void createMascota(String name, int edad, TipoMascota tipoMascota) {
        this.mascota = new Mascota(name, edad, tipoMascota);

    }


    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", mascota=" + mascota +
                '}';
    }


}
