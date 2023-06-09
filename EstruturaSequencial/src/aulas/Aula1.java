package aulas;

public class Aula1 {
	
	// Aula: processamento de dados e casting
	public static void main(String[] args) {
		int a, c;
		double resultadoInteiro, resultadoDouble;
		a = 5;
		c = 2;
		resultadoInteiro = a / c;
		System.out.println(resultadoInteiro);
		
		// Casting: converte os valores em double
		resultadoDouble = (double) a / c;
		System.out.println(resultadoDouble);

	}

}
