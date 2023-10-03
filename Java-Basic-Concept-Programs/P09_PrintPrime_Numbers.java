package practice;

import java.util.Scanner;

public class P09_PrintPrime_Numbers {

	public static void main(String[] args) {
		
		int i = 0;
		int num = 0;
		String Prime_numbers ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the last range value :");
		int n = sc.nextInt();
		sc.close();
		
		for(i=0; i<=n; i++) {
			
	         int Counter=0; 		  
	         for(num =i; num>=1; num--) {
			
				if(i%num==0) {
				
					Counter = Counter+1;
				}
	         }
		
		
		if (Counter ==2)
		 {
		    //Appended the Prime number to the String
			Prime_numbers = Prime_numbers + i + " ";
		 }	
	   }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(Prime_numbers);
	}
	
}
	