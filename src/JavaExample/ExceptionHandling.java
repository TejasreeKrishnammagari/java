package JavaExample;

public class ExceptionHandling {
 public static void main(String args[]) {
	 try {
		 int b=10/0;
		 System.out.println(b);
	 }
	 catch(Exception e) {
		 System.out.println("Exception thrown:" +e);
	 }
	 
	 finally {
		 System.out.println("The finally statement is executed");
	 }
 }
 
}
