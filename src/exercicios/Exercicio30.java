package exercicios;

/*
* Escreva um programa que calcula o desconto previdenciário de um funcionário. Dado um
* salário, o programa deve retornar o valor do desconto proporcional ao mesmo. O cálculo
* segue a regra: o desconto é de 11% do valor do salário, entretanto, o valor máximo de
* desconto é 334,29, o que seja menor
*/

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = verificarNumero(sc);
        double previdencia = calcularPrevidencia(salario);

    }

    private static double verificarNumero(Scanner sc) {
        boolean verificar = true;
        double numero = 0;
        do {
            System.out.print("Digite o salário: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Digite um número valido!");
                sc.next();
                verificar = false;
            }

            numero = sc.nextDouble();

            if (numero <= 0) {
                System.out.println("Digite um número maior que zero!");
                sc.next();
                verificar = false;
            }
        }while (!verificar);
        return numero;
    }
    private static double calcularPrevidencia(double salario) {

        double previdencia =  salario * 0.11;
        double max = 334.29;

        if (previdencia > max){
            System.out.println("Previdência do funcionário é de: " + previdencia +
                    " \nValor maximo da previdencia é de: " + max);
        }else if (previdencia == max) {
            System.out.println("Previdência do funcionário é de: " + previdencia +
                    " \nEsta igual ao valor máximo: " + max);
        }else{
            System.out.println("Previdência do funcionário é de: " + previdencia +
                    " \nValor maximo da previdencia é de: " + max);
        }
            return previdencia;
    }
}
