package aulas;

public class Aula3 {
	
	// Aula: Funções matemáticas
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// Raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// Potenciação
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		// Deixa o valor positivo
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("y = " + A);
		System.out.println("z = " + B);
		
		// Equação do segundo grau
		double a, b, c, delta, x1, x2;
		a = 2;
		b = 3;
		c = 0;
		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println("Delta = " + delta);
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);

	}

}
