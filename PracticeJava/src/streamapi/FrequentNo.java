package streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequentNo {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,2,2,2,2,3,3,5,5,5,5,5,5,8,8,9};
		int k = 3;
		
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<len; i++) {
			if(map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
					val++;
					map.put(nums[i], val);
			}else {
				map.put(nums[i], 1);
			}
		}
		List<Integer> arr = map.values().stream().sorted().collect(Collectors.toList());
		System.out.println(arr);
		int s=map.size();
		int fin = s-k;

		
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			
			int key = m.getKey();
			int value=m.getValue();
		}
	}
}
