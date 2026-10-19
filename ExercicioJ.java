package manzanoDoWhile;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Não existe divisão por zero.");
        } else {
            int quociente = 0;

            while (dividendo >= divisor) {
                dividendo -= divisor;
                quociente++;
            }

            System.out.println("Resultado inteiro da divisão: " + quociente);
        }

        sc.close();
    }
}
