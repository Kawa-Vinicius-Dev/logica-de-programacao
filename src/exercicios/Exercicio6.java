package exercicios;

    /*
    Ler um número inteiro e exibir o seu sucessor.
     */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Exibe o proximo numero.");
        System.out.println("Digite um numero: ");

        int num = validarNum(input);
        int prox = nextNum(num);

        System.out.println(prox);

        input.close();

    }

    private static int validarNum(Scanner input) {
        int num = 0;
        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Digite um numero valido! ");
                input.next();
                continue;
            }
            num = input.nextInt();

            return num;

        }
    }
    private static int nextNum(int num){
        return num +1;
    }
}