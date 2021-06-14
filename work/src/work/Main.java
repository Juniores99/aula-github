package work;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "des");
		int i = original.indexOf("e");
		int j = original.lastIndexOf("FG");
		
		
		
		
		System.out.println("Original: " + original + " -");
		System.out.println("to Lower case: " + s01 + " -");
		System.out.println("to Upper case: " + s02 + " -");
		System.out.println("trim: " + s03 + " -");
		System.out.println("substring: " + s04 + " -");
		System.out.println("Substring 2 e 9: " + s05 + " -");
		System.out.println("replace (a, x): " + s06 + " -");
		System.out.println("replace (abc, des): " + s07 + " -");
		System.out.println("index of e: " + i + " -");
		System.out.println("Last index of FG: " + j + " -");
		
		sc.close();
	}
}
