package array;

import java.util.Scanner;

public class Ex02 {
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " }\n" : ", ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int length = 1;
		String[] arr = new String[length]; 				// 배열 만들기
		String[] tmp = null; 							// 임시배열 만들기

		show(arr);										// 배열 출력

		while (true) {
			System.out.print("문자열 입력 : "); 				// 문자열 입력
			String input = sc.nextLine(); 				// 입력값 저장
			if (input.equals("")) { 					// 문자열끼리 비교는 .equals()을 사용!!!
				break; 									// 빈문자열 입력 시 종료
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) { 					// 배열이 비어있을 때
					arr[i] = input; 					// 입력값 배열에 저장
					break; 								// for문 종료
				}
			}
			show(arr);									// 배열 출력

			if (arr[arr.length - 1] != null) { 			// 배열이 꽉 찼을 때
				tmp = new String[arr.length + length]; 	// 임시배열에 새로운 배열 지정(기존배열에서 length만큼 길이가 추가된 새로운 배열)
				for (int i = 0; i < arr.length; i++) { 	// 임시배열에 기존배열에 있는 인덱스값 넣기(복사하기)
					tmp[i] = arr[i];
				}
				arr = tmp; 								// 기존배열을 임시배열과 같은 배열 참조하게 하기
			} 											// (기존배열은 garbage collector에 의해 사라짐)
		}												// (가리키고 있는 변수(?)가 없기 때문)
		System.out.println("꿑");						// while문 종료 후 "끝" 출력
		sc.close();
	}
}
