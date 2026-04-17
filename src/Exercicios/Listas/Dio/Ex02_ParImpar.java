package Exercicios.Listas.Dio;

//Faça um algoritmo para receber um número qualquer e imprimir na
// tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Ex02_ParImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero Digitado é Par");
        }else {
            System.out.println("O numero Digitado é impar");
        }
    }
}
