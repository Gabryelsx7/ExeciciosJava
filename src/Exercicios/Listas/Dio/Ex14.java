package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex14 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("A = " + a + " | B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Depois da troca:");
        System.out.println("A = " + a + " | B = " + b);

        System.out.println("O valor de A= " +a+ " e o valor de B= " +b);
    }
}
