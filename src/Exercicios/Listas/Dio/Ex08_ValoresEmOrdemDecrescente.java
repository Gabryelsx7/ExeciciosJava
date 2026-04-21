package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex08_ValoresEmOrdemDecrescente {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = scanner.nextInt();

       if ( a > b && a > c){
            if (b > c){
                System.out.println(a + " " + b + " " + c);
            }else {
                System.out.println(a + " " + c + " " + b);
            }}else if (b > a && b > c){
                if (a > c){
                    System.out.println(b + " " + a + " " + c);
                }else {
                    System.out.println(b + " " + c + " " + a);
           }}else if (c > a && c > b){
               if (a > b){
                   System.out.println(c + " " + a + " " + b);
               }else {
                   System.out.println(c + " " + b + " " + a);
       }
    }
}
}
