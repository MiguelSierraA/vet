package enumn;

public enum TipoMascota {

    PERROS(1, "perro"),
    GATOS(2, "gato"),
    AVES(3,"ave");

    private int id;
    private String nombre;

    TipoMascota(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
