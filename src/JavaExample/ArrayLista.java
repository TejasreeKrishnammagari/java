package JavaExample;

import java.util.ArrayList;

public class ArrayLista {
	public static void main(String args[]) {
		ArrayList<String> b=new ArrayList<String>();
		b.add("Mat");
		b.add("Sci");
		b.add("Eng");
		b.add("Tel");
		System.out.println(b);
		b.add(2,"hin");
		System.out.println(b);
		
	}
}
