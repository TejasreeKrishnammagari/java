package JavaExample;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String args[]) {
		
		int rev=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0) {
		rev=rev*10;
		rev=rev+num%10;
		num=num/10;
		}
		System.out.println("Reverse of number " +rev);
	}
	

}
