package Practice;

import java.util.Scanner;

public class P13_Ascii_value {

	public static void main(String[] args) {
		
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		char chr = sc.next().charAt(0); 
		
		//int ch1 = 'a'; 
		int ASCII = chr;
		
		
		System.out.println("ASCII value of " +chr+ " is :" +ASCII);
	}

}
