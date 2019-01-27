package JavaExample;

 class Override {
	public void add(int a,int b) {
		System.out.println(a+b);
	}

}
public class Overriding extends Override{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		Overriding obj1=new Overriding();
		obj1.add(10, 10);
		Override obj2=new Override();
		obj2.add(11,11);
		
	}
}
