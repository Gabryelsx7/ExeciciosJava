package Exercicios.Listas.Dio;

import java.util.Scanner;

public class Ex15 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de Nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o Atual");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        int diasTotais = idade *365;

        int anos = diasTotais / 365;
        int resto = diasTotais % 365;
        int meses = resto/ 30;
        int dias = resto % 30;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida");
    }
}
