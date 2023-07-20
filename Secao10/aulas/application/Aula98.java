package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98 {

	// Listas
	public static void main(String[] args) {
		
		// Não aceita tipos primitivos, apenas wrapper class
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------- REMOVER ----------------");
		
		list.remove("Anna");
		list.remove(1);
		// Predicado que retorna true ou false
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------- ENCONTRAR -------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Quando não encontra retorna -1
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		System.out.println("--------------- FILTRO -------------");
		
		/*
		 * 1 - Converte para stream que aceita opreções com expressão lambda
		 * 2 - stream não é compatível com List
		 * 3 - collect converte o stream para lista
		 */
		list.add("Amanda");
		list.add("Adri");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------- ENCONTRAR COM PREDICADO -------------");
		
		// finFirst() -> retorna o primeiro elemento, se não existir retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
