package AbiertoCerrado.refactor;

import java.util.List;

public class Pintor {

    public void pintar(List<Caricatura> caricaturaList){
        //foreach
        for (Caricatura caricatura: caricaturaList) {
            caricatura.dibujar();
        }

    }
}
