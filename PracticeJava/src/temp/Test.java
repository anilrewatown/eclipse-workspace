package temp;

public class Test {
	
	public static void main(String[] args) {
		
		
		int i[] = {4,5,3,2};
		
		int len = i.length;
		int fh = i[0];
		int sh = 0;
		
		
		for(int j=0; j<len-1; j++) {
			if(fh>i[j]) {
				sh=fh;
				fh=i[j];
			}
		}
		System.out.println(fh);
		System.out.println("Second Highest" + sh);
	}

}
