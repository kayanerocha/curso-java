package model.services;

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
			double value = this.paymentService.installment(valueInstallment, i);
			
			LocalDate date = contract.getDate().plusMonths(i);
			contract.getInstallments().add(new Installment(date, value));
		}
	}

}
