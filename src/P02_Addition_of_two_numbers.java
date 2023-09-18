import java.util.Scanner;

public class P02_Addition_of_two_numbers {
	
 int a, b;
	public void addition() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st number : ");
			int a = sc.nextInt();
					 
			try (Scanner sc1 = new Scanner(System.in)) {
				System.out.println("Enter 2nd number : ");
				float b = sc1.nextFloat();
				
				
				float Result = a+b;
				System.out.println("Rsult of addition is :" +Result);
			}
		}
			
	}

	
			public static void main(String[] args) {
				
				
				P02_Addition_of_two_numbers obj = new P02_Addition_of_two_numbers();
				obj.addition();
				
	}
}
