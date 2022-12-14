package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력받아서 합계를 누적시킨다
		// 만약 0을 입력하면 '더 이상 더하지 않겠다' 라는 의미로 생각하여 반복을 중단한다
		
		// 1) 변수 선언
		int input, sum = 0;
		
		while(true) {
			// 정수 입력 받기
			System.out.print("정수를 입력하세요(0 입력 시 종료) : ");
			input = sc.nextInt();
			// 입력받은 정수를 합계에 더하기
			sum += input;
			// 0 입력 시 종료
			if(input == 0)
				break;
		}
		System.out.println("합계 : " + sum);
		sc.close();
	}
}
