import java.util.Scanner;

public class P03_Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		double sqrt = Math.sqrt(num);
		System.out.println("Square root of the "+num+" is :"+sqrt);
	}
	
	}

}
