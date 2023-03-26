import clases.Cliente;
import clases.Mascota;
import clases.Veterinario;
import enumn.TipoMascota;
import enumn.TipoServicio;

public class ApplicationVeterinario {

    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario();

        Cliente clienten = new Cliente("nuevo", "Colombia", 95122120L);

        Cliente cliente = new Cliente("Jose", "Bogota", 9564120L);
        cliente.createMascota("Lulu", 7, TipoMascota.PERROS);

        Cliente cliente2 = new Cliente("Luisa", "Medellin", 18256920L);
        cliente2.createMascota("Flico", 7, TipoMascota.GATOS);

        Mascota mascota1 = new Mascota("Firu",8, TipoMascota.AVES);
        mascota1.createService(TipoServicio.PELUQUERIA,26500);

        veterinario.createCliente(cliente);
        veterinario.createCliente(cliente2);

        System.out.println("cliente = " + cliente);
        System.out.println("cliente2 = " + cliente2);
        System.out.println("mascota = " + mascota1);
        System.out.println("ClienteSolo = " + clienten);
    }
}
