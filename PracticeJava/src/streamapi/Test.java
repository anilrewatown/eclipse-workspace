package streamapi;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] i  = {12, 34, 45, 9, 8, 90, 3};
		//int[] j = {12, 34, 8, 90, 45, 9, 3};
		
		
		int len = i.length;
		int p[] = new int[len];
		int t = 0;
		for(int k=0; k<len; k++) {
			if(i[k]%2 == 0) {
				p[t] = i[k];
				t++;
			}
		}
		for(int j=0; j<len; j++) {
			if(i[j]%2!=0) {
				p[t]=i[j];
				t++;
			}
		}
		System.out.println(Arrays.toString(p));
		
	}
}
