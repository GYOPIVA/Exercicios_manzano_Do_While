package manzanoDoWhile;

import java.util.Scanner;

public class ExercicioA {
    static void main(String[] args) {

        int contador = 15;
        do {
            int quadrado = contador * contador;
            System.out.printf("%d² = %d\n", contador, quadrado);
            contador++;
        }while (contador <= 200);
    }
}
