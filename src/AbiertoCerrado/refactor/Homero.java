package AbiertoCerrado.refactor;

public class Homero extends Caricatura{

    private int cervezasTomadas;
    private int donasIngeridas;

    public Homero(int cervezasTomadas, int donasIngeridas, String nombre, int edad){
        super(nombre, edad);
        this.cervezasTomadas = cervezasTomadas;
        this.donasIngeridas = donasIngeridas;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando a homero");
    }
}
