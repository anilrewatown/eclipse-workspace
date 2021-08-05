package streamapi;

public class Factorial {
	
	public static void main(String[] args) {
		
		int no = 4;
		int factorial = 1;
		for(int i =0; i<=no; i++) {
			factorial=factorial*no;
			no--;
		}
		System.out.println(factorial);
	}
	
	

}
