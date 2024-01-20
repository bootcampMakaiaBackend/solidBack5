package AbiertoCerrado.refactor;

public class Liza extends Caricatura{

    public Liza(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando a liza");
    }
}
