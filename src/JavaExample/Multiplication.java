package JavaExample;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter the value for multiplication table");
		Scanner ele=new Scanner(System.in);
		a=ele.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a + "*" +i+ "=" +(a*i));
		}
		
	}

}
