package exercicios;

/*
Em uma certificação são feitos são feitos 5 exames (I, II, III, IV e V). Escreva um
programa que leia as notas destes exames e imprima a classificação do aluno, sabendo
que a média é 70.
Classificação: A – passou em todos os exames;
B – passou em I, II e IV, mas não em III ou V;
C – passou em I e II, III ou IV, mas não em V.
Reprovado – outras situações
*/

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in);){
            int notas [] = nota(input);
            boolean passouI = passou(notas[0]);
            boolean passouII = passou(notas[1]);
            boolean passouIII = passou(notas[2]);
            boolean passouIV = passou(notas[3]);
            boolean passouV = passou(notas[4]);

            if (passouI && passouII && passouIII && passouIV && passouV) {
                System.out.println("A – passou em todos os exames");
            } else if (passouI && passouII && passouIV) {
                System.out.println("B – passou em I, II e IV, mas não em III ou V");
            } else if (passouI && passouII && passouIII && passouIV) {
                System.out.println("C – passou em I e II, III ou IV, mas não em V.");
             } else {
                System.out.println("Reprovado");
            }
        }
    }
    private static int verificarNum(Scanner input){
        int num;
        while(true){
            System.out.print("Nota: ");
            if (!input.hasNextInt()){
                System.out.println("Digite um número valido! ");
                input.next();
                continue;
            }
                num = input.nextInt();

            if (num < 0 || num > 100){
                System.out.println("0 a 100!");
                continue;
            }
            return num;
        }
    }
    private static int [] nota(Scanner input){
        int [] nota = new int [5];

        for (int i = 0; i < nota.length; i++){
            nota[i] = verificarNum(input);
            if (nota[i] >=70){
                System.out.println("Exame " + (i+1) + " - aprovado");
            }else if (nota[i] < 70){
                System.out.println("Exame " + (i+1) + " - reprovado");
            }
        }
        return nota;
    }
    private static boolean passou(double nota) {
        return nota >= 70;
    }
}
