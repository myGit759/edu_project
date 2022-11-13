package collection;

import java.util.Comparator;

class MyIntegerComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}


public class Ex08 {
	public static void main(String[] args) {
		String[] arr = { "2", "7", "8", "4", "6" };
		showArray(arr);
		
		MyIntegerComparator cmp = new MyIntegerComparator();
		
//		list.sort(cmp);	// list는 this, 0번째 매개변수
		mySort(arr, cmp);
		showArray(arr);
	}
	
	static void mySort(String[] arr, MyIntegerComparator cmp) {
		// 배열의 선택정렬
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(cmp.compare(arr[i], arr[j]) > 0) {
//				if(arr[i] > arr[j]) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void showArray(String[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i != arr.length - 1 ? ", " : "]\n");
		}
		System.out.println();
	}
}
