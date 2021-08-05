package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Test1 {
	
	public static void main(String[] args) {
		
	String s = "my name is anil and my country name is india";
	
    String[] tokens = s.split(" ");
    
  /*   int len = tokens.length;
     List<String> notDuplicate = new ArrayList<>();
     List<String> duplicate = new ArrayList<>();
     
     for(int i=0; i<len; i++) {
    	 if(!notDuplicate.contains(tokens[i])) {
    		 notDuplicate.add(tokens[i]);
    	 }else {
    		 duplicate.add(tokens[i]);
    	 }
     }
		notDuplicate.removeAll(duplicate);
		System.out.println(duplicate);
		System.out.println(notDuplicate);*/
		
		
		
		List<String> list = Arrays.asList(tokens);
		Set<String> duplicate = new HashSet<String>();
		
		List<String> list1=list.stream().filter(x-> !duplicate.add(x)).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(duplicate);
		
		List<String> readOnly = Collections.unmodifiableList(list);
		
		readOnly.add("abc");
		
	}

}
