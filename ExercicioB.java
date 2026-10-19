package manzanoDoWhile;

public class ExercicioB {
    static void main(String[] args) {
        int contador = 2;
        int acumulador = 0;
        do {
            System.out.println(contador);
            acumulador += contador;
            contador = contador + 2;
        }while (contador < 501);
        System.out.println(acumulador);
    }
}
