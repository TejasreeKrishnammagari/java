package JavaExample;

public class Print_arrayelements {
	public static void main(String args[]) {
		int array[]= {10,20,30,40,50};
		String a[]= {"hi","im","Teja"};
		for(int element:array) {
			System.out.println(element);
		}
		for(String element:a) {
			System.out.println(element);
		}
	}

}
