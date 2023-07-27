package application;

import entities.Account;
import entities.SavingsAccount;

public class Aula160 {
	
	// Aula: Introdução ao polimorfismo
	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.00);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		// Chama a mesma operação em variáveis do mesmo tipo, porém com comportamentos diferentes de acordo com os objetos apontados
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
