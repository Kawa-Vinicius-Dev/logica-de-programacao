package exercicios;

import java.util.Scanner;

/*
 Escreva um programa que calcule o quociente da divisão de A por B (número inteiro e
positivos), ou seja, A / B, através de subtrações sucessivas. Esses dois valores são
passados pelo usuário através do teclado.
*/
public class Exercicio47 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = validarNumero(sc, "(A)");
            int b = validarNumero(sc, "(B)");
            calcularDivisao(a, b);
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

    private static void calcularDivisao(int a, int b) {

        int quociente= 0;
        int resto = a;
        while (resto >= b) {
            resto -= b;
            quociente++;
        }
        System.out.printf("quociente: %d resto: %d", quociente, resto);
    }
}
