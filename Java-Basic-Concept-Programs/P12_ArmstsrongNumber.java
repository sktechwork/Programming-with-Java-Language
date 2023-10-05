package Practice;

import java.util.Scanner;

public class P12_ArmstsrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arm=0,c;
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please enter the number : ");
				int n = sc.nextInt();
				c=n;


				while(n>0) {
					int rem=n%10;
					arm = (rem*rem*rem)+arm;
					n = n/10;			
				}
			} 
			if(c==arm) {
				System.out.println("Number is an armstrong number.");
			}
			else {
				System.out.println("Number is not an armstrong number.");
			}
	}

}
