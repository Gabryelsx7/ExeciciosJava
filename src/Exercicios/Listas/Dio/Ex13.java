package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex13 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
