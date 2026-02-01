package exercicios;

/*
Dado o tamanho do lado de um quadrado,
calcular a área e o perímetro do mesmo
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculo da área e perimetro de um quadrado. ");
        System.out.println("Valor do lado: ");

        double lado = ladovalido(input);

        double a = Math.pow(lado, 2);
        double p = lado * 4;

        System.out.print("Area: " + a + "\nPerimetro: " + p);

        input.close();
    }

    private static double ladovalido(Scanner input) {
        double lado;
        while (true) {
            if (!input.hasNextDouble()) {
                System.out.print("Digite uma valor valido: ");
                input.next();
                continue;
            }
            lado = input.nextDouble();
            if (lado <= 0) {
                System.out.print("Digite um valor valido: ");
                continue;
            }
            return lado;
        }


    }
}
