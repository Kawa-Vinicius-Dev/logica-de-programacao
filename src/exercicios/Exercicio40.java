package exercicios;

import java.util.Scanner;

/*
Em diversas situações, é útil o uso de dígitos verificadores. Dígito
verificador ou algarismo de controle é um mecanismo de autenticação utilizado para
verificar a validade e a autenticidade de um valor numérico, evitando dessa forma fraudes
ou erros de transmissão ou digitação. Uma das formas mais comuns de cálculo de dígito
verificadores é o método conhecido por módulo 11.

O Banco do Brasil utiliza o código módulo 11, substituindo por X o valor
do dígito verificador quando este é 10.
*/
public class Exercicio40 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int agenciaInformada = lerAgenciaValida(sc);
            Agencia agencia = new Agencia(agenciaInformada);
            System.out.println("Agência completa: " + agencia.obterAgenciaCompleta());
        }
    }

    public static int lerAgenciaValida(Scanner sc) {
        while (true) {
            System.out.print("Digite os quatro dígitos da agência: ");
            if (!sc.hasNextInt()) {
                System.out.println("ERRO! Digite apenas números.");
                sc.next();
                continue;
            }
            int agencia = sc.nextInt();

            if (agencia < 1000 || agencia > 9999) {
                System.out.println("ERRO! A agência deve possuir quatro dígitos.");
                continue;
            }
            return agencia;
        }
    }

    static class Agencia {
        private final int numero;

        public Agencia(int numero) {
            this.numero = numero;
        }

        private int calcularSomaPonderada() {
            int numeroTemporario = this.numero;
            int soma = 0;
            for (int peso = 2; peso <= 5; peso++) {
                int ultimoDigito = numeroTemporario % 10;

                soma += ultimoDigito * peso;
                numeroTemporario /= 10;
            }
            return soma;
        }

        private int calcularDigitoVerificador() {
            int soma = calcularSomaPonderada();
            int resto = soma % 11;

            return 11 - resto;
        }

        private String formatarDigitoVerificador() {
            int digitoVerificador = calcularDigitoVerificador();

            if (digitoVerificador == 10) {
                return "X";
            }
            return String.valueOf(digitoVerificador);
        }

        public String obterAgenciaCompleta() {
            return this.numero + "-" + formatarDigitoVerificador();
        }
    }
}