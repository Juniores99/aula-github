package work;

import java.util.Locale;
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int higher = max(a, b, c);		
		
		showresult(higher);		
						
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x; 
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showresult(int value) {
		System.out.println("Higher: " + value);
		
	}

	}


