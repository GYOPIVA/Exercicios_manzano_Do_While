package manzanoDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        float largura = 0;
        float comprimento = 0;
        String nomeComodo = "";
        do {

            System.out.println("Digite o nome do comodo: ex: Banheiro");
            nomeComodo = sc.nextLine();
            System.out.printf("Digite a largura do %s em metros: \n", nomeComodo);
            float larguraView = sc.nextFloat();
            largura += larguraView;
            System.out.printf("Digite o comprimeito do %s em metros: \n",  nomeComodo);
            float comprimeitoView = sc.nextFloat();
            comprimento += comprimeitoView;
            System.out.printf("------------\nComodo: %s\nLargura: %.1fm²\nAltura: %.1fm²\n------------\n", nomeComodo, larguraView, comprimeitoView);
            System.out.println("Deseja inserir outro comodo? SIM ou NÃO?");
            String comando = sc.next().toUpperCase();
            sc.nextLine();
            if (comando.equalsIgnoreCase("NAO")){
                continuar = false;
            }
        }while (continuar);

        System.out.println("Calculando Area...");
        float area = largura * comprimento;
        System.out.printf("Area total: %.1fm²",area);
    }
}
