package exercicios;
public class Exercicio45 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++){
            System.out.printf("%d ",i);
            soma += i;
        }
        System.out.println("\n" + soma);
    }
}