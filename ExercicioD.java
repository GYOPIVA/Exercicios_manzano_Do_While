package manzanoDoWhile;

public class ExercicioD {
    public static void main(String[] args) {

        double graos = 1;
        double soma = 0;
        int quadro = 1;

        do {
            soma += graos;
            graos *= 2;
            quadro++;

        } while (quadro <= 64);

        System.out.printf("Total de grãos: %.0f%n", soma);
    }
}
