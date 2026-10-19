package manzanoDoWhile;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int[] numeros = new int[15];
        do {
            System.out.printf("Digite o %dº número para calcular o fatorial:%n", contador + 1);
            numeros[contador] = sc.nextInt();
            contador++;

        } while (contador < 15);

        contador = 0;
        long[] fatoriais = new long[15];
        do {
            int numero = numeros[contador];
            long fatorial = 1;
            if (numero == 0) {
                fatorial = 1;
            } else {
                do {
                    fatorial *= numero;
                    numero--;
                } while (numero > 0);
            }
            fatoriais[contador] = fatorial;
            contador++;
        } while (contador < 15);

        contador = 0;
        do {
            System.out.printf("%d! = %d%n",
                    numeros[contador],
                    fatoriais[contador]);

            contador++;

        } while (contador < 15);

        sc.close();
    }
}