package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	
	private int number;
	private LocalDate date;
	private double value;	
	private ArrayList<Installment> installments;
	
	public Contract(int number, LocalDate date, double value) {
		this.number = number;
		this.date = date;
		this.value = value;
		this.installments = new ArrayList<>();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}

}
