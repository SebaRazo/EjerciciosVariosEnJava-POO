package ejercicioSH;

public class SuperHeroe {
    private String name;
    private String descrip;
    private boolean capa= false;

    public SuperHeroe(String name, String descrip, boolean capa) {
        this.name = name;
        this.descrip = descrip;
        this.capa = capa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "name='" + name + '\'' +
                ", descrip='" + descrip + '\'' +
                ", capa=" + capa +
                '}';
    }
}
