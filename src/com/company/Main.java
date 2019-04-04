package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Persona> lista =
                Arrays.asList(
                        new Persona("Matias", "Amoruso", 29, 20111333),
                        new Persona("Juan", "Perez", 17, 18000000),
                        new Persona("Lucas", "Locura", 28, 20111333),
                        new Persona("Gabriel", "Antinori", 16, 18000000),
                        new Persona("Federico", "Magia", 29, 20111333),
                        new Persona("Lorenzo", "Lamas", 15, 18000000)
                );


        List stream1 = lista.stream()
                .filter(Persona -> Persona.getEdad() > 21)
                .collect(Collectors.toList());

        System.out.println(String.format("Mayores a 21: %s", stream1));

        List stream2 = lista.stream()
                .filter(Persona -> Persona.getEdad() < 18)
                .collect(Collectors.toList());

        System.out.println(String.format("Menores de 18: %s", stream2));

        List stream3 = lista.stream()
                .filter(Persona -> Persona.getEdad() > 21 && Persona.getDni() > 20000000)
                .collect(Collectors.toList());

        System.out.println(String.format("Mayores de 21 y dni mayor a 20000000: %s", stream3));
    }
}
