import clases.Cliente;
import clases.Mascota;
import clases.Veterinario;
import enumn.TipoMascota;
import enumn.TipoServicio;

import javax.swing.*;
import java.util.Objects;


public class ApplicationVeterinario {

    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario();

        Cliente cliente = new Cliente("Jose", "Bogota", 9564120L);
        cliente.createMascota("Lulu", 7, TipoMascota.PERROS);

        Cliente cliente2 = new Cliente("Luisa", "Medellin", 18256920L);
        cliente2.createMascota("Flico", 7, TipoMascota.GATOS);

        Mascota mascota1 = new Mascota("Firu",8, TipoMascota.AVES);
        mascota1.createService(TipoServicio.PELUQUERIA,26500);


        veterinario.createCliente(cliente);
        veterinario.createCliente(cliente2);
        veterinario.createMascota(mascota1);

//        System.out.println(veterinario.mostrarClientes());
//        System.out.println("##################");
//        System.out.println(veterinario.mostrarMascotas());

        int select = -1;
        while (select != 0) {
            try {
                String veterinaria = JOptionPane.showInputDialog(null, "Elige una opción:\n" +
                        "1.- Mostrar Clientes\n" +
                        "2.- Mostrar Mascotas\n" +
                        "3.- Buscar Cliente \n" +
                        "4.- Buscar Mascota \n" +
                        "0.- Salir");
                select = Integer.parseInt(veterinaria);

                switch (select) {
                    case 1:
                        JOptionPane.showMessageDialog(null, veterinario.mostrarClientes());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, veterinario.mostrarMascotas());
                        break;
                    case 3:
                        String name = JOptionPane.showInputDialog(null,"Ingrese nombre de cliente");
                        JOptionPane.showMessageDialog(null,veterinario.buscarCliente(name));
                        break;
                    case 4:
                        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre de mascota");
                        JOptionPane.showMessageDialog(null,veterinario.buscarMascota(nombre));
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "info no encontrada");
            }

        }

    }
}
