package services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class InstallmentsService {
	
	private PaymentService paymentService;

	public InstallmentsService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void calculateInstallments(Contract contract, int numberMonths) {		
		double valueInstallment = contract.getValue() / numberMonths;
		
		for(int i=1;i<=numberMonths;i++) {
			double interest = this.paymentService.interest(valueInstallment, i);
			double tax = this.paymentService.tax(valueInstallment + interest);
			double installment = valueInstallment + interest + tax;
			LocalDate date = contract.getDate().plusMonths(i);
			
			contract.getInstallments().add(new Installment(date, installment));
		}
	}

}
