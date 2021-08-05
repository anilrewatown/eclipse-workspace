package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("B","A","C","A","B","D");
		
		
		System.out.println(new LinkedHashSet<String>(myList));
		
		System.out.println(myList.stream().distinct().collect(Collectors.toList()));
		System.out.println(myList.stream().distinct().collect(Collectors.toSet()));
		
		
		
		List<String> list = Arrays.asList("BCC","ACB","CED","ABB","BDA","DSS");
		
		//List<String> output = list.stream().filter(strings->string)
	}
	

}
