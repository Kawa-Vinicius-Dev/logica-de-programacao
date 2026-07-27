package exercicios;

import java.util.Scanner;

/*
Uma Cia de pulverização utiliza avião para pulverizar lavouras. Os custos de
pulverização dependem do tipo de praga e da área a ser contratada conforme a tabela:
Tipo 1 – ervas daninhas R$ 50,00 por acre;
Tipo 2 – gafanhotos R$ 100,00 por acre;
Tipo 3 – broca R$ 150,00 por acre;
Tipo 4 – todos acima R$ 250,00 por acre.
Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de
5%. Em adição, qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um
desconto de 10% sobre o valor que ultrapassar os R$ 750,00. Caso ambos os descontos se
aplicam o da área é calculado antes. Fazer um algoritmo que leia: o tipo de pulverização
(1 a 4) e área a ser pulverizada; e imprima o valor a ser pago.
*/
public class Exercicio38 {

    private static final double PRECO_TIPO_1 = 50.0;
    private static final double PRECO_TIPO_2 = 100.0;
    private static final double PRECO_TIPO_3 = 150.0;
    private static final double PRECO_TIPO_4 = 250.0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        Pulverizacao p1 = new Pulverizacao();
        p1.tipo = validarTipo(sc);
        p1.area = validarArea(sc);
        p1.calcularValorTotal();
        System.out.printf("Valor a pagar: R$ %.2f%n", p1.total);
        }
    }

    public static int validarTipo(Scanner sc) {
        int tipo;
        while (true) {
            System.out.println("Tipo 1 – ervas daninhas R$ 50,00 por acre;\n" + "Tipo 2 – gafanhotos R$ 100,00 por acre;\n" + "Tipo 3 – broca R$ 150,00 por acre;\n" + "Tipo 4 – todos acima R$ 250,00 por acre. ");
            System.out.print("Escolha um tipo: ");
            if (!sc.hasNextInt()) {
                System.out.println("ERRO! Digite um número valido");
                sc.next();
                continue;
            }
            tipo = sc.nextInt();
            if (tipo < 1 || tipo > 4) {
                System.out.println("ERRO! Digite um tipo valido");
                continue;
            }
            return tipo;
        }
    }

    public static double validarArea(Scanner sc) {
        double area;
        while (true) {
            System.out.print("Informe a area: ");
            if (!sc.hasNextDouble()) {
                System.out.println("ERRO! Digite um area valido");
                sc.next();
                continue;
            }
            area = sc.nextDouble();
            if (area <= 0) {
                System.out.println("ERRO! Digite um valor maior que 0");
                continue;
            }
            return area;
        }
    }

    static class Pulverizacao {
        private int tipo;
        private double area;
        private double desconto;
        private double total;

        public double obterPrecoPorAcre() {
            if (this.tipo == 1) {
                return PRECO_TIPO_1;
            } else if (this.tipo == 2) {
                return PRECO_TIPO_2;
            } else if (this.tipo == 3) {
                return PRECO_TIPO_3;
            } else if (this.tipo == 4) {
                return PRECO_TIPO_4;
            }
            throw new IllegalArgumentException(
                    "Tipo de pulverização inválido: " + this.tipo
            );
        }

        public double calcularValorBruto() {
            return obterPrecoPorAcre() * this.area;
        }

        public double calcularDesconto() {
            if (this.area > 1000) {
                this.desconto = 0.05;
            }
            return this.desconto;
        }

        public double calcularValorTotal() {
            this.total = calcularValorBruto() - calcularValorBruto() * calcularDesconto();
            if (this.total > 750) {
                double excedente  = this.total - 750;
                double descontoExcedente = excedente * 0.10;
                return this.total = this.total - descontoExcedente;
            }
            return this.total;
        }
    }
}