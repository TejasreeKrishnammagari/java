package JavaExample;
import java.util.Scanner;

public class Swap_Numbers {
	public static void main(String args[]) {
		System.out.println("Swapping of two numbers");
		Scanner sw=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sw.nextInt();
		System.out.println("Enter the value of b:");
		int b=sw.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swapping: " +a);
		System.out.println("Value of b after Swapping: " +b);
	}
}
