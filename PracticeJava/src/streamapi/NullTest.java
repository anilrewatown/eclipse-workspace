package streamapi;

public class NullTest {
	
	public void add(String s) {
		System.out.println("string class method executed");
	}
	
	public void add(Test t) {
		System.out.println("object class method executed");
	}
	
	
	public static void main(String[] args) {
		
		NullTest t = new NullTest();
		
		//t.add(null);
		
	 
	}

}
