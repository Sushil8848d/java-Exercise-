package p1;
import java.util.Scanner;
public class Number_Determine {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		
		a=sc.nextInt();
		
		if (a>0)
		{
			System.out.println(a+"is positive");
		}
		else
		{
			System.out.println(a+"is negative");
		}
	}
}
