package exercicios;

/*
 * Escreva um algoritmo que leia 2 valores (x e y), que devem representar as coordenadas
 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0)
 */

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x = lerInteiro(input, " x");
            int y = lerInteiro(input, " y");
            System.out.printf("Ponto: (%d, %d)%n", x, y);
            eixoOringem(x, y);
        }

    }
    private static int lerInteiro(Scanner input, String descricao) {
        while (true) {
            System.out.print("Digite o valor de " + descricao + ": ");

            if (input.hasNextInt()) {
                return input.nextInt();
            }

            System.out.println("Digite um número inteiro válido!");
            input.next();
        }
    }


    private static void eixoOringem(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            quadrante(x, y);
        }
    }

    private static void quadrante(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }
    }
}