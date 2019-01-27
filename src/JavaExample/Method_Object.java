package JavaExample;

public class Method_Object {
	public void m1() {
		System.out.println("Method 1");
	}
	public void m2() {
		System.out.println("Method 2");
	}
	public void m3() {
		System.out.println("Method 3");
	}
	public static void main(String args[]) {
		System.out.println("Main method execution");
		Method_Object obj=new Method_Object();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
