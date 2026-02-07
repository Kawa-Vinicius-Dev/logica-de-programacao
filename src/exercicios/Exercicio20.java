package exercicios;
/*
 * Escreva um programa que calcule a raiz de uma equação do primeiro grau.
 */

import java.util.Scanner;

public class Exercicio20 {

    private static final String RAIZ_DA_EQUACAO = "Equação do 1º grau: ax + b = 0";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(RAIZ_DA_EQUACAO);

        printFinal(input);

        input.close();
    }


    private static double lerNumeroValido(Scanner input, String descricao) {

        boolean valido;
        double numero = 0;

        do {

            System.out.print("Digite o valor de " + descricao + ": ");

            if (!input.hasNextDouble()) {
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
            } else {
                numero = input.nextDouble();
                valido = true;
            }
        } while (!valido);
        return numero;
    }

    private static double calculaEquacao(Scanner input) {

        double a = lerNumeroValido(input, "(a)");

        while (a == 0) {
            System.out.println("O valor de (a) não pode ser 0.");
            a = lerNumeroValido(input, "(a)");
        }

        double b = lerNumeroValido(input, "(b)");

        return -b / a;
    }

    private static void printFinal(Scanner input) {
        double raiz = calculaEquacao(input);
        System.out.printf("Raiz da equação  = %.2f", raiz);
    }
}

