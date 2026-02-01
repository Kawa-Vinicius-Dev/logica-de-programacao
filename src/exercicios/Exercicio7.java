package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[2];
        System.out.println("Ler dois números inteiros e exibe o quociente e o resto da divisão.");

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = validarNum(input);
        }

        divisaoNum(num);
    }

    private static int validarNum(Scanner input) {
        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Digite um valor válido!");
                input.next(); // descarta entrada inválida
                continue;
            }
            return input.nextInt();
        }
    }

    private static void divisaoNum(int[] num) {
        if (num[1] == 0) {
            System.out.println("Divisão por zero não é permitida!");
            return;
        }

        int quociente = num[0] / num[1];
        int resto = num[0] % num[1];

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
