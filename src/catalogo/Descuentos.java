package catalogo;

import java.util.LinkedList;
import java.util.Random;

import idiomas.Idioma;

public class Descuentos {

    public static void descuento(Idioma idioma){
        LinkedList<Departamento> proba = idioma.getProbabilidades();
        Random azar = new Random();
        Departamento conDescuento = proba.get(azar.nextInt(proba.size()));
        conDescuento.aplicarDescuentoDepartamento((azar.nextInt(3)+1)/10);
    }

}
