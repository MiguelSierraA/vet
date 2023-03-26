package clases;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {

    private List<Cliente> clienteList;
    private List<Mascota> mascotaList;


    public Veterinario() {
        clienteList = new ArrayList<>();
        mascotaList = new ArrayList<>();
    }   

    public void createCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public void createMascota(Mascota mascota) {
        mascotaList.add(mascota);

    }

}
