package exercicios;
/*
Chama-se ano bissexto o ano ao qual é acrescentado um dia extra, ficando ele com 366
dias, um dia a mais do que os anos normais de 365 dias, ocorrendo a cada quatro anos.
Escreva um programa que verifique se um ano é bissexto. Um ano é bissexto se ele é
divisível por 4. Entretanto, se o ano é divisível por 100, ele não é bissexto. Mas, se ele for
divisível por 400, ele volta a ser bissexto.
a. São bissextos os anos: 1600, 1996, 2000, 2004, 2008, 2012, 2016, 2400, 2800, ...
b. Não são bissextos: 1500, 1974, 1982, 1983, 1990, 2018, 2022, 2030, 2038,
*/

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int anoInf = lerAnoValido(sc);
            Ano a1 = new Ano(anoInf);
            a1.verificarAnoBissexto();
        }
    }

    static class Ano {
        private final int ano;
        public Ano(int ano) {
            this.ano = ano;
        }
        public boolean verificarAnoBissexto() {
            if (this.ano % 400 == 0) {
                System.out.println("Ano bissexto!");
                return true;
            } else if (this.ano % 100 == 0) {
                System.out.println("Ano não é bissexto!");
                return false;
            } else if (this.ano % 4 == 0) {
                System.out.println("Ano bissexto!");
                return true;
            } else {
                System.out.println("Ano não é bissexto!");
                return false;
            }
        }
    }

    static int lerAnoValido(Scanner sc) {
        int ano;
        while (true) {
            System.out.print("Digite o ano:");
            if (!sc.hasNextInt()) {
                System.out.println("ERRO! Digite um ano valido");
                sc.next();
                continue;
            }
            ano = sc.nextInt();
            if (ano < 1) {
                System.out.println("ERRO! Digite um ano valido");
                continue;
            }
            return ano;
        }
    }
}