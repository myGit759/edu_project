package day03;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		// if 문제
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 세 정수 중에서 최소값을 찾아서 출력하세요
		Random ran = new Random();
		
		int n1 = ran.nextInt(10) + 1;
		int n2 = ran.nextInt(10) + 1;
		int n3 = ran.nextInt(10) + 1;
		int min;
		
		min = n1;
		
		if(min > n2) min = n2;
		if(min > n3) min = n3;
		System.out.printf("%d %d %d\n", n1, n2, n3);
		System.out.printf("최솟값 : %d", min);
		
		System.out.println("\n");
		
		
		// 2) 정수를 입력받아서, 정수의 절댓값을 출력하는 코드를 작성하세요
		
		System.out.print("정수 입력 : ");
		int input2 = sc.nextInt();
		
		input2 = (input2 >= 0) ? input2 : -input2;
		
		System.out.println("절댓값 : " + input2);
//		if(input2 >= 0) System.out.println("절댓값 : " + input2);
//		else			System.out.println("절댓값 : " + (input2 * -1));
		
		System.out.println("\n");
		
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요

		System.out.print("정수 입력 : ");
		int input3 = sc.nextInt();
		if(input3 == 0)				System.out.println("0");
		else if(input3 % 2 == 1 )	System.out.println("홀수입니다");
		else						System.out.println("짝수입니다");
		
		sc.close();
		
		
		
		
		
		
	}
}
