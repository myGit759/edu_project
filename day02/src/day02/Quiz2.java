package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// if 문제
		
		/*
		 * 		이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 		기본요금 3천원으로 시작하여 10분당 추가요금 500원이 발생한다
		 * 		요금표는 아래와 같은 규칙으로 적용한다
		 * 		0 ~ 30		3000원
		 * 		31 ~ 40		3500원
		 * 		41 ~ 50		4000원
		 * 		...
		 * 
		 * 		이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 */
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		int user,overcost = 0, fee = 0;
		
		// 2) 입력
		System.out.print("이용 시간을 입력하세요(분 단위) : ");
		user = sc.nextInt();
		
		// 3) 계산
		// 요금은 3000원 고정값으로 둔다(최소금액)
		fee = 3000;
		
		// 3-1) 만약 입력값이 30분보다 작거나 같다면 그냥 진행
		if (user <= 30);
			
		// 3-2) 만약 입력값이 30분보다 크다면 overcost에 500 * (기본시간(30분)을 빼고, 10분단위로 나눈 몫을 곱해준다)
		else {							  // ↓ +1을 하는 이유 : ?1분을 포함 시키기 위해
			overcost = 500 * ((user - 31)/10+1);
			fee += overcost;        // ↑ - 31을 하는이유 : ?0분을 포함 시키기 위해
		}
		
		// 4) 출력
		System.out.printf("이용 시간 : %d분\n", user);
		System.out.printf("최종 금액 : %,d원\n", fee);
		
		// end) 마무리
		sc.close();
	}
}
