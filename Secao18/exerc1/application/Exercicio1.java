package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import services.InstallmentsService;
import services.PaypalPaymentService;

public class Exercicio1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numberContract = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), dtm);
		System.out.print("Valor do contrato: ");
		double valueContract = sc.nextDouble();
		
		Contract contract = new Contract(numberContract, date, valueContract);
		
		System.out.print("Entre com o número de parcelas: ");
		int numberInstallments = sc.nextInt();
		
		InstallmentsService installmentsService = new InstallmentsService(new PaypalPaymentService());
		
		installmentsService.calculateInstallments(contract, numberInstallments);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment.toString());
		}
		
		sc.close();

	}

}
