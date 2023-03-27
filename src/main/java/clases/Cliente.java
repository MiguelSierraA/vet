package clases;


import enumn.TipoMascota;

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
        return "Cliente = " + name + " - " + address + " - " + telephone + "\n"
                + mascota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
