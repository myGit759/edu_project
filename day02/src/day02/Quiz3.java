package day02;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요
		int n1 = 1234;
		int n2 = 0;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);	// 4321
		
		// 1) for문을 이용한 풀이
		for(;n1 > 10;) {
			n2 += (n1 % 10);
			n2 *= 10;
			n1 /= 10;
		}
		n2 += n1;
		System.out.println("n2 : " + n2);
		
		// 2) while문을 이용한 풀이
//		while(true) {
//			if (n1 >= 10) {
//				n2 += (n1 % 10);
//				n2 *= 10;
//				n1 /= 10;
//			}else {
//				n2 += n1;
//				break;
//			}
//		}
//		System.out.println("n2 : " + n2);
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int oddSum = 0, evenSum = 0;
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
	}
}
