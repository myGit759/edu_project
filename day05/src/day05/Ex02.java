package day05;

public class Ex02 {
	
	static int sum(int... args) {	// 배열 형태로 받아서 가변 인자 처리!!(몇개가 들어올지 모르니까)
		// 자바에서 특정 객체의 자료형을 알고 싶다면, getClass()
//		System.out.println(args);
//		System.out.println(args.getClass().);	// 패키지.클래스
//		System.out.println(args.getClass().getSimpleName());	// 클래스(단순한 이름만 가져온다)
		
		int total = 0;
		for(int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
		
	}
	public static void main(String[] args) {
		
		// 가변 인자 : 함수 호출 때 전달하는 인자의 개수가 변할 수 있다
		
		int n1 = sum(1);
		int n2 = sum(1, 2);
		int n3 = sum(1, 2, 3);
		int n4 = sum(1, 2, 3, 4);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
	}
}
