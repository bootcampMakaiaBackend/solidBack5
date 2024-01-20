package AbiertoCerrado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Homero homero = new Homero(1,3);
       Bar bar = new Bar(1);
       Liza liza = new Liza("LIZA");
       Pintor pintor = new Pintor();
        List<Object> caricaturas = new ArrayList<>();
        caricaturas.add(homero);
        caricaturas.add(bar);
        caricaturas.add(liza);
       pintor.dibujar(caricaturas);
       //que pasa si agrego a Lisa?
    }
}
