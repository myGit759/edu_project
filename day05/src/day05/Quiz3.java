package day05;

public class Quiz3 {
	static int min(int...args) {
		int result = 10000000;
		for(int i = 0; i < args.length; i++) {
			int num = args[i];
			if(result > num) {
				result = num;
			}
		}
		return result;
	}
	
	static int count(String str, char ch) {
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char strCh = str.charAt(i);
			if(strCh == ch)
				result += 1;
		}
		return result;
	}
	
	static boolean check(String str) {
		// result는 false를 기본값으로 설정
		boolean result = false;
		int hyperCnt = 0;	
		
		// '-'의 개수 구하기(있으면 hyperCnt에 1씩 추가)
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( ch == '-') {
				hyperCnt += 1;
			}
		}
		
		// '-'기준으로 분리하기
		String[] arr = str.split("-");

//		------------------ 필터 거치기 -----------------
		
		// 전체 길이가 19개('-'포함)가 아니면 result(false) 즉시반환 , 맞으면 통과↓
		if (str.length() != 19) return result;
		
		// '-'이 3개가 아니면 result(false) 즉시반환  
		if (hyperCnt != 3) return result;	// 맞으면 통과↓
		else {
			for(int i = 0; i < arr.length; i++) {				// 배열의 길이 만큼 for문 반복
				if (arr[i].length() != 4) return result;		// 배열에 i번째 인덱스의 길이가 4가 아니면 result(false) 즉시반환
				else result = true;								// 모든 필터를 거친 후 다 통과 되면 result = true로 변경(대입)
			}
		}
		return result;							// result(true) 반환
	}
	
	public static void main(String[] args) {
		
		// 배열이나 문자열의 인덱스는 항상 0부터 시작하여 (길이 -1)까지 존재한다
		
		// 1) 정수를 여러 개 전달 받아서, 최솟값을 반환하는 함수를 작성하세요
		int n1 = min(10, 5, 11, 23, 42, 1);
		System.out.println("n1 : " + n1);
		
		// 2) 문자열에서 특정 글자가 몇 개 포함되어 있는지 함수를 작성하세요
		int n2 = count("Life is too short, you need python", 'o');
		System.out.println("n2 : " + n2);
		
		// 3) 문자열 형태로 카드번호를 입력 받아서, 길이가 맞는지 확인하는 함수를 작성하세요
		// 전체길이, -의 개수, 분리했을 때 각 단위의 길이		
		boolean b1 = check("1234-1234-1234-1234");	// true
		boolean b2 = check("867-2356123-1234567");	// false
		boolean b3 = check("930516-2345678");		// false
		System.out.printf("%b, %b, %b\n", b1, b2, b3);
	}
}
