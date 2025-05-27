package Hashset1;

import java.util.HashSet;
import java.util.Set;

public class ejercicio1_Hashset {
    public void mostrarusuario() {
        Set<String> Listado = new HashSet<>();

        Listado.add("camila10");
        Listado.add("betzabe19");
        Listado.add("alisson12");
        Listado.add("eduardo6");
        Listado.add("camila10");

        System.out.println("Lista de usuarios unicos: " + Listado);

        System.out.println("La lista contiene el usuario betzabe10?: "+ Listado.contains("betzabe19"));
    }
}
