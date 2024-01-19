package model.services;

public class PaypalPaymentService implements PaymentService {
	
	public double interest(double valueInstallment, int installment) {
		return valueInstallment * 0.01 * installment;
	}
	
	public double tax(double valueInstallment) {
		return valueInstallment  * 0.02;
	}
	
	public double installment(double valueInstallment, int installment) {
		double interest = this.interest(valueInstallment, installment);
		return valueInstallment + interest + this.tax(valueInstallment + interest);
	}

}
