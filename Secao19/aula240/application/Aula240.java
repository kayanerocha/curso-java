package application;

import java.util.Arrays;
import java.util.List;

public class Aula240 {

	public static void main(String[] args) {		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	// Funciona para qualquer tipo de lista pois utiliza o tipo curinga ?, se utilizar Object da erro
	public static void printList(List<?> list) {
		// list.add(3); -> não é possível adicionar em tipo curinga
		for (Object obj : list) {
			System.out.println(obj);
		}	
	}

}
