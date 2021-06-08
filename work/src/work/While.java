package work;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesil = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			}
			else if (tipo == 2) {
				gasolina += 1;
			}
			else if (tipo == 3) {
				diesil += 1;
			}
			
						
			tipo = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesil: " + diesil);
		
		sc.close();
		
		
		
		
	}

}
