package services;

public interface PaymentService {
	
	double interest(double value, int installment);
	
	double tax(double value);

}
