package JavaExample;

public class String_Rev {
	public static void main(String args[]) {
		String a="Tejasree";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		System.out.println("rev completed");
	}

}
