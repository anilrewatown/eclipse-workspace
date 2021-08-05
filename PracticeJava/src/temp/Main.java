package temp;
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
        String line;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}
