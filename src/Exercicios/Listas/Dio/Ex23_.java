package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex23_ {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas aulas o Professor deu?");
        double quantidadAula= scanner.nextDouble();

        double valorAula = 12;
        double inss = 0.08;

        double salario = quantidadAula * valorAula;
        double desconto = salario * inss;
        double salarioLiquido = salario-desconto;


        System.out.println("O valor do salario é de: "+salario);
        System.out.println("O valor descontado é: "+desconto);
        System.out.println("Valor Liquido: "+salarioLiquido);

    }
}
