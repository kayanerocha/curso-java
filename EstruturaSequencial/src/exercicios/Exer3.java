package exercicios;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        System.out.print("A = ");
        A = sc.nextInt();
        System.out.print("B = ");
        B = sc.nextInt();
        System.out.print("C = ");
        C = sc.nextInt();
        System.out.print("D = ");
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}
