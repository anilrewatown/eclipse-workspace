package collection;

import java.util.Arrays;

public class List {

	static Object[] objects = new Object[10];
	int i = 0;

	public void add(Object obj) {
	
			if(i<objects.length) {
				objects[i]=obj;
			} 
				  else { 
				  Object[] newObj = new Object[objects.length+10];
				  for(int j=0;j<8;j++) {
					  newObj[j]=objects[j];
				  }
				  objects=newObj; 
				  objects[i]=obj;	 
				  } 
			
		i++;
	}

	public static void main(String[] args) {

		List l = new List();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(3);
		l.add(23);
		l.add(3);
		l.add(23);
		l.add(4);
		l.add(34);
		l.add(53);
		l.add(33);
		l.add(43);

		System.out.println(Arrays.toString(objects));
	}

}
