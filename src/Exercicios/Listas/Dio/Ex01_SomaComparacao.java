package Exercicios.Listas.Dio;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
// na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Ex01_SomaComparacao {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de A");
        int a = scanner.nextInt();

        System.out.println("Digite valor de b");
        int b = scanner.nextInt();

        System.out.println("Digite valor de c");
        int c = scanner.nextInt();

        int soma = a+b;
        System.out.println("A soma de A + B é: " + soma);
        System.out.println("O valor de C é: " +c);


        if (soma < c) {
            System.out.println("A soma de A e B é MENOR que C");
        } else if (soma == c) {
            System.out.println("A soma de A e B é IGUAL a C");
        } else {
            System.out.println("A soma de A e B é MAIOR que C");
        }
    }
}
