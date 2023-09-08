package ejercicioSH;

public class Dimension {
    private double alto;
    private  double ancho;
    private double profun;

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profun = 0;
    }

    public Dimension(double alto, double ancho, double profun) {
        this.alto = alto;
        this.ancho = ancho;
        this.profun = profun;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfun() {
        return profun;
    }

    public void setProfun(double profun) {
        this.profun = profun;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profun=" + profun +
                "volumen"+ getVolumen()+'}';
    }

    public double getVolumen(){
        return alto * ancho * profun;
    }
}

