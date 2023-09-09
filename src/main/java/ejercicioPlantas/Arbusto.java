package ejercicioPlantas;

public class Arbusto extends Planta{
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private boolean sePodaONo;

    public Arbusto(){

    };

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double ancho, boolean esDomestico, String variedad, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.sePodaONo = sePodaONo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Soy un Arbusto");
    }
}
