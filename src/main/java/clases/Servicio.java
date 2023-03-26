package clases;

import enumn.TipoServicio;

public class Servicio {

    private TipoServicio tipoServicio;
    private float price;

    public Servicio(TipoServicio tipoServicio, float price) {
        this.tipoServicio = tipoServicio;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "tipoServicio=" + tipoServicio +
                ", price=" + price +
                '}';
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
