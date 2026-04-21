package Exercicios.Listas.Dio;

import java.util.Scanner;

public class EX12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À vista (Dinheiro/Pix) - 15% desconto");
        System.out.println("2 - À vista no cartão - 10% desconto");
        System.out.println("3 - 2x no cartão - preço normal");
        System.out.println("4 - 3x ou mais - +10% juros");

        int opcao = scanner.nextInt();
        double valoraFinal;

        switch (opcao){
            case 1 :
                valoraFinal = valor * 0.85;
                break;
            case 2 :
                valoraFinal = valor * 0.90;
                break;
            case 3 :
                valoraFinal = valor;
                break;
            case 4 :
                valoraFinal = valor * 1.10;
                break;
            default:
                System.out.println("Opção invalida");
                return;
        }
        System.out.println("Valor final de: " +valoraFinal);
    }
}
