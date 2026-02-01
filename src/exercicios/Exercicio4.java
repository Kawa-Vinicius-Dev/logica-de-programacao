package exercicios;

/*
Dado o tamanho do raio de uma circunferência,
calcular a área e o perímetro da mesma.
*/

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo da área e do perímetro da circunferência");
        System.out.print("Digite o raio: ");

        double raio = lerRaioValido(input);

        double p = calcularPerimetro(raio);
        double a = calcularArea(raio);

        System.out.println("Perímetro = " + p);
        System.out.println("Área = " + a);

        input.close();
    }

    private static double lerRaioValido(Scanner input) {
        double raio;

        while (true) {
            if (!input.hasNextDouble()) {
                System.out.print("Entrada inválida. Digite um número: ");
                input.next();
                continue;
            }

            raio = input.nextDouble();

            if (raio <= 0) {
                System.out.print("O raio deve ser maior que zero: ");
                continue;
            }

            return raio;
        }
    }

    private static double calcularPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }

    private static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
