package streamapi;

import java.util.HashMap;
import java.util.Map;

public class CharactorCount {
	
	public static void main(String[] args) {
		
		String s = "hi how are you";
		
		char[] ch = s.replaceAll("\\s","").toCharArray();
		
		int len = ch.length;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<len; i++) {
		
			if(map.containsKey(ch[i])) {
				int no = map.get(ch[i]);
				no++;
				map.put(ch[i], no);
			}else {
				map.put(ch[i], 1);
			}
		}
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.print(m.getKey());
			System.out.println(" "+m.getValue());
		}
	}

}
