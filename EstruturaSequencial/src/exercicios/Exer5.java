package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, numeroPecas;
        double valorUnitario, total;

        codigo = sc.nextInt();
        numeroPecas = sc.nextInt();
        valorUnitario = sc.nextDouble();
        total = numeroPecas * valorUnitario;

        codigo = sc.nextInt();
        numeroPecas = sc.nextInt();
        valorUnitario = sc.nextDouble();
        total = total + numeroPecas * valorUnitario;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
