package service;

import java.util.List;

public class CalculationService {
	
	// Especifica que o tipo T ou qualquer superclasse de T é um tipo Comparable para que assim utilize o método comparateTo() com qualuqer tipo
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
