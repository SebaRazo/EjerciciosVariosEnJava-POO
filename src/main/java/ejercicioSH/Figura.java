package ejercicioSH;

public class Figura {
    private int codigo;
    private double precio;
    private SuperHeroe superheroe;
    private Dimension dimensiones;

    public Figura(int codigo, double precio, SuperHeroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(SuperHeroe superhéroe) {
        this.superheroe = superhéroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }
    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", superhéroe=" + superheroe +
                ", dimensiones=" + dimensiones +
                '}';
    }
}
