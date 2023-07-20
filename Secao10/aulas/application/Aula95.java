package application;

public class Aula95 {
	
	// Aula: Boxing, unboxing e wrapper classes
	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj1 = x;
		
		System.out.println(obj1);
		
		int y = (int) obj1;
		
		System.out.println(y);
		
		// Wrapper class que trata o tipo primitivo como classe
		Integer obj2 = x * 2;
		
		System.out.println(obj2);
		
		// Sem o casting pois usou a classe Integer
		int z = obj2;
		
		System.out.println(obj2);
		
	}

}
