package streamapi;


public class Test5 {
	
public void add() {
	
}

public static void main(String[] args) {
	
	
	/*
	 * Integer a = null; int b = a; System.out.println(b);
	 */
	
	
	
	try {
	    int c = 1/0;
	} catch (Exception e) {
	    System.out.println("E");
	} finally {
	    System.out.println("F");
	}
}

}