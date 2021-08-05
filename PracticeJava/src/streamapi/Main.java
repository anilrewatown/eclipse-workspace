package streamapi;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static List<String> processData(ArrayList<String> array) {
       
    	Map<String,String> map = new HashMap<>();
    	List<String[]> arr = new ArrayList<String[]>();
    	Set<String> name = new HashSet<String>();
    	for(String s : array) {
    		String[] str = s.split(", ");
    		String[] price = str[4].split(" ");
    		arr.add(str);
    		if(map.containsKey(str[1])) {
    			if( (Integer.parseInt(price[1]) > Integer.parseInt(map.get(str[1]))))
    		       map.put(str[1], price[1]);
    		}
    		else
    			map.put(str[1], price[1]);
    	}
    	for(Map.Entry<String, String> m : map.entrySet()) {
    		for(String[] s : arr) {
    			String[] price = s[4].split(" ");
    			if(Integer.parseInt(price[1]) == Integer.parseInt(m.getValue())) {
    				name.add(s[0]);
    			}
    		}
    	}
       List<String> retVal = new ArrayList<String>(name);
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
		/*
		 * String line; Scanner in = new Scanner(System.in); while(in.hasNextLine())
		 * inputData.add(in.nextLine());
		 */
        
        inputData.add("Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash");
        inputData.add("Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card");
        inputData.add("Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash");
        inputData.add("Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card");
        inputData.add("T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card");
        inputData.add("Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card");
        inputData.add("Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card");
        inputData.add("Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI");
        inputData.add("Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash");
        inputData.add("Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI");
        inputData.add("Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI");
        
        
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}
