package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double aumontPaid(double price, double value) {
		return price * value + (price * value * IOF);
	}

}
