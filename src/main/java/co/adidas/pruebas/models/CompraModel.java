package co.adidas.pruebas.models;

public class CompraModel {

    private String prenda;
    private String nombrePrenda;
    private String talla;
    private String mensaje;

    public CompraModel() {
    }

    public CompraModel(String prenda, String nombrePrenda, String talla, String mensaje) {
        this.prenda = prenda;
        this.nombrePrenda = nombrePrenda;
        this.talla = talla;
        this.mensaje = mensaje;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
