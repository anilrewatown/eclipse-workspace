package temp;

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		int[] i = {1,2,3,4,5,6,7,8,9};
		
		
		 int last = i.length-1;
		 int first=0;
		 
		 while(first<last) {
			
			 if(i[last]+i[first]<15) {
				 first++;
			 }else {
				 if(i[last]+i[first]>15)
				 last--;
				 else {
					 System.out.println(i[first]);
					 System.out.println(i[last]);
					 first++;
				     last--;
				 }
			 }
			
		 }
		
	}

}
