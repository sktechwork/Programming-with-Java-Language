package practice;

import java.util.Scanner;

public class P04_Swapping_of_two_variable {

	
		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter First Number");
				int a = sc.nextInt();
				
				System.out.println("Enter Second Number");
				int b = sc.nextInt();
				
				System.out.println("Values of a and b before Swaping :"+"a = "+a + "&" +"b = "+b);
				
				int temp = 0;
				temp=a;
				a=b;
				b=temp;
				
				System.out.println("Values of a and b after Swaping :"+"a = "+a+ "&" +"b = "+b);
			}
		}
	}


