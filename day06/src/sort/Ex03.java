package sort;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		// 두 변수의 값을 교환하기
		
		int n1 = 10, n2 = 20;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		int tmp = n1;
		n1 = n2;
		n2 = tmp;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		
		
		int[] arr = { 50, 21, 64, 10, 55, 1, 3 };
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
