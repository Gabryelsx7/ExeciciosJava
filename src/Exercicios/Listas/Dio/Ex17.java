package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex17 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        double tempF = scanner.nextDouble();

        double celsius = (5 * ( tempF-32) / 9);

        System.out.printf("Fahrenheit: %.2f°F\n", tempF);
        System.out.printf("Celsius: %.2f°C\n", celsius);

    }
}
