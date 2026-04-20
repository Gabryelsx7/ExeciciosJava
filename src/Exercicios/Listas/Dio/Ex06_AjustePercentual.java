package Exercicios.Listas.Dio;


import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class Ex06_AjustePercentual {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Valor");
        double valor = scanner.nextDouble();

        double novoValor = valor * 1.05;
        System.out.println("Valor com reajuste de 5% é " +novoValor);
    }
}
