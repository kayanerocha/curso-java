package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = 3.14159 * Math.pow(C, 2);
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.printf("\nCIRULO: %.3f", circulo);
        System.out.printf("\nTRAPEZIO: %.3f", trapezio);
        System.out.printf("\nQUADRADO: %.3f", quadrado);
        System.out.printf("\nRETANGULO: %.3f", retangulo);

        sc.close();
    }
}
