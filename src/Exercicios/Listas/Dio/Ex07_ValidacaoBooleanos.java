package Exercicios.Listas.Dio;

import java.util.Scanner;


//7 - Faça um algoritmo que leia dois valores booleanos
//     (lógicos) e determine se ambos são VERDADEIRO ou FALSO

public class Ex07_ValidacaoBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro (true/false):");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite o segundo (true/false):");
        boolean valor2 = scanner.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são verdadeiros");
        } else {
            System.out.println("Não são ambos verdadeiros");
        }

    }
}