package Exercicios.Listas.Dio;

//Faça um algoritmo que leia dois valores inteiros A e B,
// se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos
// cálculos deve-se atribuir o resultado a uma variável C

import java.util.Scanner;

public class Ex03_Numeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite valor de B");
        int b = scanner.nextInt();

        int c;

        if (a == b){
            c = a+b;
            System.out.println("A e B são iguais. Soma: "+c);

        }else if (a != b){
            c = a*b;
            System.out.println("A e B são diferentes. Multiplicação: "+c);
        }
    }
}
