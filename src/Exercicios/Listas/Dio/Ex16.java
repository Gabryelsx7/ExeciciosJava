package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex16 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro lado do Triangulo:");
        int p1 = scanner.nextInt();

        System.out.println("Segundo lado do Triangulo:");
        int p2 = scanner.nextInt();

        System.out.println("Terceiro lado do Triangulo:");
        int p3 = scanner.nextInt();

        if (p1 + p2 > p3 && p1 + p3 > p2 && p2 + p3 > p1) {

            if (p1 == p2 && p1 == p3){
                System.out.println("Triangulo equilatero");

            }else if (p1 == p2 || p1 == p3 || p2 == p3){
                System.out.println("Triangulo isóceles");

        }else{
                System.out.println("Triangulo escaleno");
            }
    }else {
            System.out.println("Valor é Falso");
}}}
