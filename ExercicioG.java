package manzanoDoWhile;

public class ExercicioG {

    public static void main(String[] args) {


        int contadora = 1;
    do {
        if (contadora % 2 != 0) {

            int numero = contadora;
            int original = numero;
            int fatorial = 1;

            do {
                fatorial *= numero;
                numero--;
            } while (numero > 0);
            System.out.printf("%d! = %d%n", original, fatorial);
        }
        contadora++;
    } while (contadora <= 10);


    }
}