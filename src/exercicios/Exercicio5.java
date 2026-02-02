package exercicios;

/*
* Dado os três lados de um triângulo
* determinar o perímetro do mesmo.
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcula o perimetro de um triangulo. ");
        System.out.println("Digite os valores dos lados:");

        double[] lados = new double[3];

        for (int i = 0;i < lados.length;i++){
            System.out.print((i + 1) + " lado: ");

            lados[i] = validarLados(input);

        }

        double p = perimetroTriangulo(lados);

        System.out.println("Perimetro = " + p);

        input.close();
    }


private static double validarLados(Scanner input) {
    double lado;
    while (true) {
        if (!input.hasNextDouble()) {
            System.out.println("Digite um valor valido! ");
            input.next();
            continue;
            }

        lado = input.nextDouble();

        if (lado <= 0){

            System.out.println("Digite um valor maior do que 0!" );
            continue;
        }
        return lado;
         }
    }

    private static double perimetroTriangulo(double[] lados){
        double soma = 0;
        for (double lado : lados){
            soma += lado;
        }

        return soma;

    }
}