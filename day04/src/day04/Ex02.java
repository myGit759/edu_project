package day04;

public class Ex02 {
	static int getMaxNum(int n1,int n2,int n3) {
		
		int max = n1;
		
		max = (max < n2) ? n2 : max;
		max = (max < n3) ? n3 : max;
		
		return max;
	}
	
	static int getReverseNum(int num) {
		int revNum = 0;
		
		while(num != 0) {
			revNum *= 10;
			revNum += num % 10;
			num /= 10;
		}
		return revNum;
	}
	
	static int getFee(int playTime) {
		
		int fee = 3000;
		int overcost = 500 * ((playTime - 21)/10);
		
		return playTime > 30 ? fee + overcost : fee;
		// 삼항 연산은 값을 결정하고, return 은 값을 반환 하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다
	}
	
	static int getSummary(int sNum, int eNum) {
		int result = 0;
		
		for (int i = sNum;i <= eNum; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		// 1) 세 정수를 전달 받아서, 가장 큰 수를 반환 하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요
		int n2 = getReverseNum(1234);
		System.out.println("n2 : "+ n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요
		int n3 = getFee(40);
		System.out.println("n3 : " + n3);
		
		for(int i = 0; i < 50; i++) {
			System.out.printf("%d분 : %d\n",i, getFee(i));
		}
		
		// 4) 두 정수 a, b를 전달받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요 (for)
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
	}
}
