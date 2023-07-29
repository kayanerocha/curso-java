package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aula157 {
	
	// Aula: Upcasting e downcasting
	public static void main(String[] args) {
		
		 // Account acc = new Account(1001, "Alex", 0.0);
		 BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		 
		 /*
		  * UPCASTING: atribui um objeto da subclasse a uma variável da superclasse
		  * Uma BusinessAccount é uma Account 
		  * O objeto do tipo superclasse não acessa os métodos da subclasse
		  */
		 Account acc1 = bacc;
		 Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		 Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		 
		 /*
		  * DOWNCASTING: atribui um objeto da superclasse a uma variável da subclasse
		  * O objeto do tipo subclasse continua acessando seus próprios métodos e os da superclasse
		  */
		 BusinessAccount acc4 = (BusinessAccount) acc2;
		 acc4.loan(100.0);
		 
		 // Verifica se o objeto da subclasse é instância da superclasse para fazer o casting com a subclasse correta
		 if (acc3 instanceof BusinessAccount) {
			 BusinessAccount acc5 = (BusinessAccount) acc3;
			 acc5.loan(200.0);
			 System.out.println("Loan!");
		 }
		 
		 if (acc3 instanceof SavingsAccount) {
			 SavingsAccount acc5 = (SavingsAccount) acc3;
			 acc5.updateBalance();
			 System.out.println("Update!");
		 }
	}

}
