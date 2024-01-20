package liskov;

public class Adulto extends Persona{

    private String dni;
    private String tarjetaCredito;

    public Adulto(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public void pagar(){
        System.out.print("pagando desde el adunto");
    }
}
