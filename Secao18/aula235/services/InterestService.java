package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	// Implementação padrão do método para que as outras classes não precisem repetir o código
	default public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1 + getInterestRate() / 100, months);
	}
}
