package exercicios;

/*
 * exercício 2:
 *Dado o tamanho da base e da altura de um retângulo,
 *calcular a sua área e o seu perímetro.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double b = 0;
        double h = 0;

        while (true) {
            System.out.println("Calculo Área.\nDigite altura (h) e a base (b) do retangulo: ");
            if (!input.hasNextDouble()) {
                System.out.println("Valor invalido! Digite um número para altura.");
                input.next();
                continue;
            }
            h = input.nextDouble();
            if (h<0){
                System.out.println("A Altura deve ser positiva!");
                continue;
            }
            if (!input.hasNextDouble()) {
                System.out.println("Valor invalido! Digite um número para base.");
                input.next();
                continue;
            }
            b = input.nextDouble();
            if (b<0){
                System.out.println("A Base deve ser positiva!");
                continue;
            }
            break;
        }

        double a = b * h;

        System.out.println("Area:" + a);

        input.close();

    }
}