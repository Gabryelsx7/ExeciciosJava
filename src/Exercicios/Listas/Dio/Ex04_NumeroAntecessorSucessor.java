package Exercicios.Listas.Dio;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor

import java.util.Scanner;

public class Ex04_NumeroAntecessorSucessor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero");
        int numero = scanner.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("Numero digitado é " +numero);
        System.out.println("O sucessor desse numero é "+sucessor);
        System.out.println("O atecessor desse numero é "+antecessor);

    }
}
