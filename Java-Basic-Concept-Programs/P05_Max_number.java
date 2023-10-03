package practice;

import java.util.Scanner;

public class P05_Max_number {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter 1st number :");
			int f1 = sc.nextInt();
			
			System.out.println("Please enter 2nd number :");
			int f2 = sc.nextInt();
			
			System.out.println("Please enter 3rd number :");
			float f3 = sc.nextFloat();
			
			if(f1>f2) {
				if(f1>f3) {
					System.out.println("First number is Max number "+f1);
				}
			}
			if(f2>f1) {
				if(f2>f3) {
					System.out.println("Second number is Max number "+f2);
				}
			}
			if(f3>f2) {
				if(f3>f1) {
					System.out.println("Third number is Max number "+f3);
				}
			}
		}
	}

}

