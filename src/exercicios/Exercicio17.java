package exercicios;

/*
 * Escreva um programa para gerar o invertido de um número com três algarismos
 * (exemplo: o invertido de 498 é 894).
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        inverterValor(input);

        input.close();

    }

    private static int lerNumeroValido(Scanner input, String descricao) {
        int valor = 0;
        boolean valido;

        do {
            System.out.print("Digite o valor do " + descricao + ":");

            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
            } else {
                valor = input.nextInt();
                valido = valor > 0;
                if (!valido) {
                    System.out.println("Digite um número maior que 0! ");
                }
            }

        } while (!valido);
        return valor;
    }

    private static int inverterValor(Scanner input) {

        int valor = lerNumeroValido(input, "número");
        int invertido = 0;

        while (valor != 0) {
            int digito = valor % 10;
            invertido = invertido * 10 + digito;
            valor /= 10;
        }
        System.out.println("Número invertido é igual: " + invertido);
        return valor;
    }
}
