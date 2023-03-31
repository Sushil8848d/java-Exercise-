package assignment2;
import java.util.Scanner;

public class add {
	public static void main (String[]args)
	{
		int a,b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=add(a,b);
		System.out.println("The sum of a and b "+sum);
		
	}
  static  int add(int a,int b)
  {
	 int sum;
	 sum=a+b;
	 return sum;
	  
  }

}
