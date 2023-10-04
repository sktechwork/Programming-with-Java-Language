package Practice;
import java.util.Scanner;

public class P11__PrintFibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number : ");
		int count =sc.nextInt();
		
		
		int a=0,b=1,c,i;  
		 System.out.print(a+" "+b);//printing 0 and 1  
		  
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
		 {  
		  c=a+b;  
		  System.out.print(" "+c);  
		  a=b;  
		  b=c;  
		 }  

	}

	

}
