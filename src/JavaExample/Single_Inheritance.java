package JavaExample;

 class A{
	 int x=10;
	 int y=20;
	 public void test() {
		 System.out.println("Selenium IDE");
	 }
 }
 class B extends A{
	 int a=5;
	 int b=5;
	 public void test1() {
		 System.out.println("Selenium WD");
		 System.out.println(x+y);
	 }
	 
 }

public class Single_Inheritance extends B {
	public void test3() {
		System.out.println(a+b);
		System.out.println(x+y);
	}
	public static void main(String args[]) {
		Single_Inheritance obj=new Single_Inheritance();
		obj.test();
		obj.test1();
		obj.test3();
		
		
	}

}
