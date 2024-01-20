package AbiertoCerrado.refactor;

import AbiertoCerrado.Bar;
import AbiertoCerrado.Homero;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            Caricatura bar = new AbiertoCerrado.refactor.Bar("bar",12);
            Caricatura homero = new AbiertoCerrado.refactor.Homero(1, 12,"homero", 12);
            Caricatura liza = new AbiertoCerrado.refactor.Liza("liza", 14);
            List<Caricatura> caricaturas = new ArrayList<>();
            caricaturas.add(bar);
            caricaturas.add(homero);
            caricaturas.add(liza);
            Pintor pintor = new Pintor();
            pintor.pintar(caricaturas);
        }
}
