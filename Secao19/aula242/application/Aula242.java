package application;

import entities.Client;

public class Aula242 {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // false pois o == não compara o conteúdo, mas sim as referências de memória (quando usa new)
		System.out.println(s1 == s2); // true, pois o compilador trata de forma especial para literais como "Test" (quando não usa new)
	}

}
