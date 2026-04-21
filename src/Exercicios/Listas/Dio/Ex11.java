package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex11 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua Nota do 1ºBimestre ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a sua Nota do 2ºBimestre ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a sua Nota do 3ºBimestre ");
        int nota3 = scanner.nextInt();

        int media = (nota1+nota2+nota3)/3;

        System.out.println("Sua media no total foi de: "+media);
        if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
}}
