package JavaExample;
abstract class Bank{
	abstract void credit();
	abstract void debit();
} 
class HDFC extends Bank{
	public void credit() {
		System.out.println("Amount credit from HDFC");
	}
	public void debit() {
		System.out.println("Amount debit from HDFC");
	}
}
class ICICI extends Bank{
	public void credit() {
		System.out.println("Amount credit from ICICI");
	}
	public void debit() {
		System.out.println("Amount debit from ICICI");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		HDFC h=new HDFC();
		h.credit();
		h.debit();
		ICICI i=new ICICI();
		i.credit();
		i.debit(); 
		
	}

}
