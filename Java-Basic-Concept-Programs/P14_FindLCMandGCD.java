package Practice;

import java.util.Scanner;

public class P14_FindLCMandGCD {
	
	public static void main(String[] args) {
		int hcf=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st number :");
			int f1 = sc.nextInt();
			
			System.out.println("Enter second number :");
			int s2 =sc.nextInt();
			
			for(int i=1; i<=f1||i<=s2; i++) {
				if(f1%i==0 && s2%i==0) {
				hcf = i;
				}
			}				
			System.out.println("HCF of " +f1+ " and " +s2+" : "+hcf);

		}
		
	}

}
