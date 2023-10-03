package practice;

import java.util.Scanner;

public class P08_Prime_number {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number :");
			float num = sc.nextFloat();
			
			boolean flag = false;
			
			for(int i=2; i<=num/2; i++) {
				if(num%i == 0) {
					flag =true;
					break;
				}
			}
			if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
		}
	}
}