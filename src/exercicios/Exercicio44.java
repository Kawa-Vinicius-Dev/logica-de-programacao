package exercicios;
/*
Escreva um programa que imprima todos os números pares do intervalo fechado de 1 a
100.
*/
public class Exercicio44{
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.printf("%d ",i);
            }

        }
    }
}