package exercicios;

/*
 * Faça um algoritmo para calcular a nota semestral de um aluno.
 * A nota semestral é  obtida pela média aritmética entre a nota de 2 bimestres.
 * Cada nota de bimestre é composta por 2 notas de provas.
 */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1 = lerNumeroValido(input, "prova 1");
        double nota2 = lerNumeroValido(input, "prova 2");
        double notaSemestre = calculoNotaSemestral(nota1, nota2);


        input.close();
    }

    private static double lerNumeroValido(Scanner input, String descricao) {
        double nota = 0;
        boolean valido;

        do { //fazer ...
            System.out.print("Digite a nota " + descricao + ":");

            if (!input.hasNextDouble()) {
                System.out.println("Digite um valor valido! ");
                input.next();
                valido = false;
                continue;
            }
            nota = input.nextDouble();
            valido = nota >= 0 && nota <= 10;

            if (!valido) {
                System.out.println("Digite um numero entre 0 e 10! ");
                continue;
            }

        } while (!valido); //continua enquanto não for valido

        return nota;
    }

    private static double calculoNotaSemestral(double nota1, double nota2){
        double notaSemestral = (nota1 + nota2) / 2;

        System.out.println("Nota Semestral " + notaSemestral);
        return notaSemestral;
    }
}