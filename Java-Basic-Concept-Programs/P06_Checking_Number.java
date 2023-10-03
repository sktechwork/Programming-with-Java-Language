package practice;

import java.util.Scanner;

public class P06_Checking_Number {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the number :");
			byte b = sc.nextByte();
			
			if(b==0) {
				System.out.println("Value of b is zero :"+b);		
				}
			if(b>0) {
				System.out.println("Value of b is positive :" +b);
				
			}
			if(b<0) {
				System.out.println("Value of b is negative : " +b);
			}
		}

	}

}
