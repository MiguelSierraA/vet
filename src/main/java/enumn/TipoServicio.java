package enumn;

public enum TipoServicio {

    CONSULTA(1,"Consulta"),
    VACUNACION(2,"Vacunación"),
    PELUQUERIA(3,"Peluqueria"),
    OTRO(4, "Otros");

    private int id;
    private String nombre;

    TipoServicio(int id, String nombre) {
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
