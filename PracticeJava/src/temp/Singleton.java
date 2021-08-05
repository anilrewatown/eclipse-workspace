package temp;

public final class Singleton {
	
  private Singleton singlton;
	
	
	
	public Singleton getInstance() {
		
		if(singlton != null) {
		  synchronized (this) {
			if(singlton==null) {
				singlton=new Singleton();
			}
		}
	}
		return singlton;
	}






	public static void main(String[] args) {
		
	}

}
