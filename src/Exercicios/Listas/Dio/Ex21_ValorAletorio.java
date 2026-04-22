package Exercicios.Listas.Dio;

import java.util.Random;

public class Ex21_ValorAletorio {
    static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(101);

        System.out.println("Numero aletório " +numero);
    }
}
