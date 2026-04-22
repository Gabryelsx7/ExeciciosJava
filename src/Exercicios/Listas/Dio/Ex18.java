package Exercicios.Listas.Dio;

public class Ex18 {
    static void main(String[] args) {

        double francisco = 1.50D;
        double sara  = 1.10D;

        int anos = 0;

        while (francisco >= sara){
            francisco += 0.02;
            sara += 0.03;
            anos ++;

            System.out.println("Serão necessários " + anos +  " anos.");
            System.out.printf("Altura Francisco: %.2f\n", francisco);
            System.out.printf("Altura Sara: %.2f\n", sara);
        }
    }
}
