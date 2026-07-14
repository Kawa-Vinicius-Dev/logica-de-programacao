package exercicios;
/*
Uma financeira usa o seguinte critério para conceder empréstimos: o valor total do
empréstimo deve ser até dez vezes o valor da renda mensal do solicitante e o valor da
prestação deve ser no máximo 30% da renda mensal do solicitante. Escreva um programa
que leia a renda mensal de um solicitante, o valor total do empréstimo solicitado e o
número de prestações que o solicitante deseja pagar e informe se o empréstimo pode ou
não ser concedido.
*/

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        double salarioMensal = validarNum(input, "Salario mensal: ");
        double valorEmprestimo = validarNum(input, "Valor do empréstimo: ");
        double prestacoes = validarNum(input, "prestações: ");
            System.out.println(liberacaoEmprestimo(salarioMensal, valorEmprestimo, prestacoes));
        }
    }
    private static double validarNum(Scanner input, String descricao) {
       while (true) {
           System.out.print(descricao);
           if (!input.hasNextDouble()){
               System.out.println("Digite um número valido! ");
               input.next();
               continue;
           }

           double salario = input.nextDouble();

           if (salario < 0){
               System.out.println("Digite um número maior que zero!");
               continue;
           }
           return salario;
       }
    }
    private static String liberacaoEmprestimo(double salarioMensal,
                                              double valorEmprestimo,
                                              double prestacoes){

        if (valorEmprestimo > salarioMensal * 10){
            return "empréstimo negado!";
        } else if (valorEmprestimo/prestacoes > (salarioMensal * 0.3)){
            return "empréstimo negado!";
        } else{
            return "empréstimo aprovado!";
        }
    }
}