package practice;

import java.util.Scanner;

public class P10_Factorial {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number:");
			int c = sc.nextInt();
			
			int i, fact=1;
			for(i=1; i<=c; i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+c+" is :"+fact);
		}
		
	}

}
