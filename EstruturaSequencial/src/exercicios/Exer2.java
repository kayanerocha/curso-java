package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14159;
        System.out.print("Raio = ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
