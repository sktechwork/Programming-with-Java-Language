package Practice;

import java.util.Scanner;

public class P15_LCM {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st number :");
			int n1 = sc.nextInt();
			
			System.out.println("Enter second number :");
			int n2 =sc.nextInt();
			
			System.out.println("LCM of " + n1 +" and " + n2 +" is " + findLcm(n1, n2));
		} 
		
		
	}

	private static int findLcm(int n1, int n2) {		
		return (n1 / findGcd(n1, n2)) * n2;  
		
	}

	private static int findGcd(int n1, int n2) {
		if(n1 == 0) {
			return n2;
		}
		return findGcd(n2%n1,n1);
	}

}	