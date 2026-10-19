package manzanoDoWhile;

import java.util.Scanner;

public class ExercicioI {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorDigitado = 0;
        int acumulador = 0;
        System.out.println("Digite um numero negativo para encerrar!");
                do {
                    System.out.println("Digite um valor: ");
                    valorDigitado = input.nextInt();
                    if (valorDigitado < 0){
                        System.out.println("Encerrando");
                        break;
                    }
                    acumulador += valorDigitado;
                }while (valorDigitado > 0);
        System.out.println("Total:" + acumulador);

    }
}
