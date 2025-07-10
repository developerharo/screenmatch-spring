package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {

    public void muestraEjemplo() {
        List<String> nombres = Arrays.asList("Brenda","Luis","Laura","Genesys");

        nombres.stream()
                // Ordernar los nombres alfabeticamente
                .sorted()
                // Limitar la lista a máximo 4 nombres
                .limit(4)
                // Solo mostrar nombres que inicien con la letra L
                .filter(n -> n.startsWith("L"))
                // Convertir los nombres filtrados a mayúsculas
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
