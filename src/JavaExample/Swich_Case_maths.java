package JavaExample;
import java.util.Scanner;

public class Swich_Case_maths {
	public static void main(String args[]) {
		int ch,a,b;
		
		Scanner ele=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=ele.nextInt();
		System.out.println("Enetr the value of b:");
		b=ele.nextInt();
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		System.out.println("Enter ur choice");
		ch=ele.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Addition of 2 numbers are: " +(a+b) );
			break;
		case 2:
			System.out.println("Subtraction of 2 numbers are:" +(a-b));
			break;
		case 3:
			System.out.println("Multiplication of 2 nos are:" +(a*b));
			break;
		case 4:
			System.out.println("Division of 2 no's are:" +(a/b));
			break;
		default:
			System.out.println("invalid choice");
		}
		
		
	}

}
