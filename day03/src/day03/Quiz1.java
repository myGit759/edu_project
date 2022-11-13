package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		int current, min, evNum;
		
		
		/*
		 * 	1층에서 15층 사이의 엘리베이터 3개가 있습니다
		 * 	사용자에게 현재 층을 입력받아서 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 	출력문을 만들어서 출력해주세요
		 */
		System.out.printf("1번 엘베 : %d층 | 2번 엘베 : %d층 | 3번 엘베 : %d층\n", n1, n2, n3);
		System.out.print("현재 층 입력(1 ~ 15) : ");
		current = sc.nextInt();
		
		// 현재층과의 거리(차이) 구하기 (절댓값이 필요하기 때문에 삼항연산자 사용)
		n1 = (current -n1) >= 0 ? current - n1:n1 - current;
		n2 = (current -n2) >= 0 ? current - n2:n2 - current;
		n3 = (current -n3) >= 0 ? current - n3:n3 - current;
		
		// 최솟값 구하기 & 최솟값인 엘베 지정
		min = n1;
		evNum = 1;
		 
		if(min > n2) {
			min = n2;
			evNum = 2;
		}
		if(min > n3) {
			min = n3;
			evNum = 3;
		}
		
		System.out.printf("%d번 엘베 출발", evNum);
		sc.close();
		
	}
}
