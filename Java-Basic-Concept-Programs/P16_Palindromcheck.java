package Practice;

import java.util.Scanner;

public class P16_Palindromcheck {
	
	public static void main(String[] args) {
		String original,reverse = "";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String :");
			original = sc.nextLine();
		}
		int length = original.length();
		
		for(int i =length-1; i>=0; i--) {
			
			reverse = reverse + original.charAt(i);			
		}if(reverse.equals(original)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}
		
	}

}
