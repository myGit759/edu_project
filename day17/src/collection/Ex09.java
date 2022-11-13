package collection;

import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		
		int[] arr2 =  { 2, 7, 8, 4, 6 };
		List<int[]> list2 = Arrays.asList(arr2);
		
		list.sort((a, b) -> a - b);
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		list2.sort(null);
		System.out.println(list2);
		

	}
}
