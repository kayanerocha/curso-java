package services;

public class PaypalPaymentService implements PaymentService {
	
	@Override
	public double interest(double valueInstallment, int installment) {
		return valueInstallment * 0.01 * installment;
	}
	
	@Override
	public double tax(double value) {
		return value  * 0.02;
	}

}
