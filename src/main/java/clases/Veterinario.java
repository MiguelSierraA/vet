package clases;


import java.util.ArrayList;
import java.util.List;

public class Veterinario {

    private List<Cliente> clienteList;
    private List<Mascota> listaMascotas;
    private List<Servicio> listaServicios;

    public Veterinario() {

        clienteList = new ArrayList<>();
        listaMascotas = new ArrayList<>();
        listaServicios = new ArrayList<>();

    }

    public void createCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public void createMascota(Mascota mascota) {
        listaMascotas.add(mascota);

    }

    public String mostrarClientes(){
        String result= "";
        for (int i = 0; i < this.clienteList.size(); i++) {
            result += (i + 1) + ". " + clienteList.get(i) + "\n";
        }
        return result;
    }

    public String mostrarMascotas() {
        String result= "";
        for (int i = 0; i < this.listaMascotas.size(); i++) {
            result += (i + 1) + ". " + listaMascotas.get(i) + "\n";
        }
        return result;
    }

    public String buscarCliente(String name) {
        Cliente clienteTemp = null;
        for (Cliente client : this.clienteList) {
            if (client.getName().equals(name)) {
                clienteTemp = client;
                return ("Cliente se encuenta en la base");
            }

        }
        if (clienteTemp != null) {
            return mostrarClientes();
        }else{
            return ("El cliente no existe !!");
        }

    }

    public String buscarMascota(String name) {
        Mascota mascotaTemp = null;
        for (Mascota mascota : this.listaMascotas) {
            if (mascota.getName().equals(name)) {
                mascotaTemp = mascota;
                return ("Mascota se encuenta en la base");
            }

        }
        if (mascotaTemp != null) {
            return ("no hay nada en la");
        }else{
            return ("Mascota no existe !!");
        }

    }

}
