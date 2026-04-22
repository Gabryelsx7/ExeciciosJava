package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex20_Tabuada {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int valor = scanner.nextInt();

        System.out.println("Fazendo a Tabuado do " + valor);

        for (int i = 1; i < 10; i++) {
            System.out.println(valor + "x" + i + "=" + (valor * i));
        }
    }
}
