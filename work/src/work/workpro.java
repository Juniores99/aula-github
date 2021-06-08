package work;

import java.util.Locale;

public class workpro {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measue = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich a price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich a price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decomal places: %.8f%n", measue);		
		System.out.printf("Rouded (three decimal places: %.3f%n", measue);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f5n", measue);
				
				

	}

}
