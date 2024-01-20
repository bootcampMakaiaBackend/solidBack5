package AbiertoCerrado.refactor;

public class Bar extends Caricatura{

    public Bar(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando a bar");
    }

    public void eliminar(){

    }
}
