package JavaExample;

public class Continue {
	public static void main(String args[]) {
		for(int i=1;i<10;i++) {
			if(i==5) 
				continue;        //continue-Breaking the current process and continue from the next level
				System.out.println(i);
			}
		}

}
