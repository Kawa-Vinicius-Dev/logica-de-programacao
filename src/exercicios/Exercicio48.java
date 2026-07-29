package exercicios;

import java.util.Scanner;

/*
 Escreva um programa que calcule o resto da divisão de A por B (número inteiros e
positivos), ou seja, A % B, através de subtrações sucessivas. Esses dois valores são
passados pelo usuário através do teclado.
*/

public class Exercicio48 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = validarNumero(sc, "(A)");
            int b = validarNumero(sc, "(B)");
            int resto = calcularResto(a, b);
            System.out.printf("resto:%d", resto);
        }
    }

    private static int validarNumero(Scanner sc, String descricao) {
        while (true) {
            System.out.print("Digite " + descricao + ": ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("ERRO! número invalido!!");
                continue;
            }
            int numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("Digite um número maior que zero!");
                continue;
            }
            return numero;
        }
    }

    private static int calcularResto(int a, int b) {
        int resto = a;

        while (resto >= b) {
            resto -= b;
        }
        return resto;
    }
}