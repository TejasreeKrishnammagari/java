package JavaExample;

public class Dt_Variables {
	int b=20;
	static String empid="789";
	public void m1() {
		int a=10;
		System.out.println("value of a is " +a);
	}
	public void m2() {
		System.out.println("Value of b is " +b);
		
	}
	public static void st() {
		System.out.println("Static nethod executed");
	}
	public static void main(String args[]) {
		Dt_Variables obj=new Dt_Variables();
		obj.m1();
		obj.m2();
		Dt_Variables.st();
	}


}
