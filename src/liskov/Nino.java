package liskov;

public class Nino extends Persona{

    private String tarjetaIdentidad;
    private Adulto adulto;

    public Nino(String nombre, String apellidos, String tarjetaIdentidad) {
        super( nombre, apellidos);
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

    public void setAdulto(Adulto adulto) {
        this.adulto = adulto;
    }

    public Adulto getAdulto() {
        return adulto;
    }
}
