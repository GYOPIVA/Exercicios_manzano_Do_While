package manzanoDoWhile;

public class ExercicioC {
    static void main(String[] args) {
        int contador = 1;

        do {
            if (contador % 4 == 0) {
                System.out.println(contador);
            }
            contador++;
        }while (contador < 201);
    }
}
