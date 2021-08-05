package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	
	
	public static void main(String[] args) {
		
		

		/*
		 * Input: Good day day bye bye 
		 * output: Good day bye
		 * 
		 * input: greet the day user greet good day 
		 * output:greet the day user good
		 */

        String input = "Good day day bye bye";
        
        String[] words = input.split(" ");
       // System.out.println(words[0]);
        
        int len = words.length;
        
        
        
       Set<String> set = new HashSet<String>();
        
        for(int i =0; i <len; i++) {
        	set.add(words[i]);
        }
        
        
          Set<String> output = set.stream().filter(null).collect(Collectors.toSet());
		   System.out.println(output);
		
		
	}

}
