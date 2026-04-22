package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex22_ {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo valor:");
        double b = scanner.nextDouble();

        System.out.println("A divisão do valor a e b é: "+(a/b));
        System.out.println("O resto da divisão é " +(a%b));
    }
}
