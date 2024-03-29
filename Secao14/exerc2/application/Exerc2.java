package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exerc2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				products.add(new UsedProduct(name, price, sdf.parse(date)));
			} else if (type == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else {
				products.add(new Product(name, price));
			}	
		}
		
		System.out.println();
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
