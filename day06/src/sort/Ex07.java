package sort;

public class Ex07 {
	public static void main(String[] args) {
		
		String str = "Helloworld";
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 정렬을 수행한다면?
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
						char tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
