package temp;

import java.util.Collections;
import java.util.LinkedList;

public class Example{
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {4, 10,34, 56, 123};
		
		int[] arr2 = {2, 7,9,55,112};
		
		int len = arr1.length;
		int len2 = arr2.length;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<len; i++) {
			list.add(arr1[i]);
		}
		
		for(int j=0; j<len; j++) {
			list.add(arr2[j]);
		}
		 Collections.sort(list);
		System.out.println(list);
		
		
		int temp[] = new int[arr1.length+arr2.length];
		
		int big = 0;
		int small;
		int k=0;
		
		for(int i=1; i<len; i++) {
			
			big = arr1[k];
			if(arr1[i]>big) {
				big=arr1[i];
			}
		}
		
		int l = temp.length;
		temp[l]=big;
		l--;
		
		
		
		
		
}
}