package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Número: ");
        numero = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Valor ganho por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;
        System.out.printf("NUMBER = %d \nSALARY = U$ %.2f", numero, salario);

        sc.close();
    }
}
