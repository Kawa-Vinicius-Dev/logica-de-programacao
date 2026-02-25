package exercicios;

/*
 * Escreva um programa que leia 3 números e calcule a média ponderada entre eles.
 * Considere que o maior número recebe peso 5 e os outros dois recebem peso 2,5.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = calcularMediaPonderada(sc);

        System.out.printf("Media: %.2f" ,media);

        sc.close();

    }

    private static double[] verificarNumeroValido(Scanner sc, String descricao) {
        boolean valido = false;
        double[] numero = new double[3];


        do {
            System.out.print("Digite um " + descricao + ": ");
            for (int i = 0; i < numero.length; i++) {
                if (!sc.hasNextDouble()) {
                    System.out.println("Digite um número valido ");
                    sc.next();
                    valido = false;
                    continue;
                }
                numero[i] = sc.nextDouble();
                valido = true;
            }

        }while (!valido) ;
        return numero;
    }
    private static double calcularMediaPonderada(Scanner sc){
        //pegar o valor dos indices do meu array e calcular a media ponderada
        //o  maior numero recebe 5 e os outros recebem 2 e 5

        double[] numero = verificarNumeroValido(sc,"número" );

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] > numero[j + 1]) {
                    double temp = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numero));
        double media = ((numero[0] * 2) + ((numero[1] + numero[2]) * 5)) / 12;
        return media;
    }
}
