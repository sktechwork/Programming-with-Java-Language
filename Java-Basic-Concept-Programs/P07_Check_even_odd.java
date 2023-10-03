package practice;

import java.util.Scanner;

public class P07_Check_even_odd {
	public static void main(String[] args) {

	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Please enter the number :");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Value of num is even :"+num);		
			}
		else
			System.out.println("Value of num is odd :" +num);
			
	}
  }
}