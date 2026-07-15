package exercicios;

import java.util.Scanner;

/*
Escreva um programa que leia um número inteiro de 1 a 7 e informe o dia da semana
correspondente, sendo domingo o dia de número 1. Se o número não corresponder a um
dia da semana, mostre uma mensagem de erro
*/
public class Exercicio36 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String [] diaSemana = {"Domingo", "Segunda", "Terça","Quarta",
                                    "Quinta", "Sexta", "Sabado"};
            int dia = validarDia(input);
            System.out.println(diaSemana[dia-1]);
        }
    }
    private static int validarDia(Scanner input){
        while (true){
            System.out.print("Digite o dia: ");
            if (!input.hasNextInt()){
                System.out.println("Digite um número valido! ");
                input.next();
                continue;
            }

            int dia = input.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Digite um dia da semana!");
                continue;
            }
            return dia;
        }
    }
}
