package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Escreva um programa que leia 3 valores e escreva a soma dos 2 maiores.
 */

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = ordenarArray(sc);
        System.out.println("Soma = " + soma);

        sc.close();
    }

    private static double[] lerNumeroValido(Scanner sc) {
        double[] numero = new double[3];

        for (int i = 0; i < 3; i++) { // i<3 = i==2 teoricamente
            while (true) {
                System.out.print("Digite um número: ");

                if (!sc.hasNextDouble()) {
                    System.out.println("Digite um número valido! ");
                    sc.next();
                } else {
                    numero[i] = sc.nextDouble();
                    break;
                }
            }
        }
        return numero;
    }

    private static double ordenarArray(Scanner sc) {
        double[] numero = lerNumeroValido(sc);
        Arrays.sort(numero);
        double soma = numero[2] + numero[1];
        return soma;
    }
}

