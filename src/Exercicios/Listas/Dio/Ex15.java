package Exercicios.Listas.Dio;

import java.util.Scanner;

public class    Ex15 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia de nascimento:");
        int diaN = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mesN = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoN = scanner.nextInt();

        System.out.println("Digite o dia atual:");
        int diaA = scanner.nextInt();

        System.out.println("Digite o mês atual:");
        int mesA = scanner.nextInt();

        System.out.println("Digite o ano atual:");
        int anoA = scanner.nextInt();


        if(diaA < diaN) {
            diaA += 30;
            mesA -= 1;
        }
            if(mesA < mesN){
                mesA += 12;
                anoA -= 1;
        }
            int dias = diaA - diaN;
            int meses = mesA - mesN;
            int anos = anoA - anoN;

            System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida");

        }
}
