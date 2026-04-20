package Exercicios.Listas.Dio;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o
// valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Ex05_CalculoSalariosMinimos {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1293.20D;

        System.out.println("Digite um salário");
        double salarioUsuario = scanner.nextDouble();
        //R$ 2.586,40

        double comparacao = salarioUsuario/salarioMinimo;
        System.out.println("Você ganha " + comparacao + " salários mínimos");

    }

}
