package exercicios;

/*
 *Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
 * mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado
 * para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima"
 * no sentido de que as notas de menor valor fossem distribuídas em número mínimo
 * possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar
 * uma nota de R$ 50,00, três notas de R$ 10,00, uma nota de R$ 5,00 e duas notas de R$
 * 1,00. Escreva um programa que receba o valor da quantia solicitada e retorne a
 * distribuição das notas de acordo com o critério da distribuição ótima (considere existir
 * notas de R$1,00; R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        destribuicaoOtima(input);

    }

    private static int lerValorValido(Scanner input, String descricao) {
        boolean valido;
        int valor = 0;

        do {
            System.out.print("Digite um " + descricao + ":");
            if (!input.hasNextInt()) {
                System.out.println("Digite um número valido! ");
                input.next();
                valido = false;
            } else {
                valor = input.nextInt();
                valido = valor > 0;
                if (!valido) {
                    System.out.println("Digite um númrero maior que 0!");
                }
            }
        } while (!valido);
        return valor;
    }

    private static void destribuicaoOtima(Scanner input) {
        int valor = lerValorValido(input, "valor");

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < notas.length; i++) {

            int quantidade = valor / notas[i];

            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$ " + notas[i]);
                valor = valor % notas[i];
            }
        }
    }
}
