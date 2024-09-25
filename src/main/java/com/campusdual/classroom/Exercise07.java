package com.campusdual.classroom;

import java.util.List;
import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(5);           // Busca el número 5 en la lista
        sumFirstNaturalNumbers(10);   // Suma los primeros 10 números naturales
        showFirstNaturalNumbers(5);   // Muestra los primeros 5 números naturales
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            numbers.add(i);
        }

        int index = numbers.indexOf(num);
        if (index != -1) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + (index + 1));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " números naturales es: " + sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Los primeros " + num + " números naturales son:");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

