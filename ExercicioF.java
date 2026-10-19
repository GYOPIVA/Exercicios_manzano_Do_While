package manzanoDoWhile;

import java.util.Scanner;

public class ExercicioF {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros = 0;
        int soma = 0;
        do {
            System.out.println("Digite um numero: (Caso queira terminar digite um numero negativo!)");
            numeros = input.nextInt();
            if (numeros < 0) {
                break;
            }
            soma += numeros;

        }while (true);
        System.out.println("A soma dos numeros digitados é: " + soma);
    }
}
