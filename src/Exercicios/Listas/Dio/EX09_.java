package Exercicios.Listas.Dio;


import java.util.Scanner;

public class EX09_ {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Seu peso: " + peso + " Sua altura: " + altura);
        double imc = peso / (altura * altura);

        System.out.println("Seu imc é igual " +imc);

        System.out.println("Resultado: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println(" Obesidade grau I ");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
        scanner.close();
    }
}
