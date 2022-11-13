package day05;

public class Quiz4 {
	static String profile(long data) {
		String result = "";
		String gender = "";
		int age = 0;
		
		// 주민번호 앞 6자리 + 성별을 구별하는 뒷자리 첫째 1자리만 남기고 제거 
		data /= 1000000;
		
		// 성별 구하기
		if ((data % 10) == 1 || (data % 10) == 3) gender = "남성";
		if ((data % 10) == 2 || (data % 10) == 4) gender = "여성";
		
		// 2000년대 생 이전 이후 구분하기 위해 변수 생성 (뒷자리 시작번호 1,2 or 3,4)
		int centuryCalc = (int)data % 10;

		// 나이 구하기
		data /= 100000;

		if (centuryCalc == 1 || centuryCalc == 2) {	// 주민번호 뒷자리가 1 또는 2로 시작되면
			age = 2022 - (1900 + (int)data - 1);	// 나이 계산
		}
		if(centuryCalc == 3 || centuryCalc == 4) {	// 3 또는 4이면
			age = 22 -((int)data - 1);				// 나이 계산
		}
		
		result = age + "세, " + gender + "입니다.";	// result(문자열)에 나이 및 성별 대입 
		
		return result;
	}

	static String profile(String data) {
		String result = "";
		String gender = "";
		

		// 성별 구하기
		if (data.charAt(7) == '1' || data.charAt(7) == '3') gender = "남성";
		if (data.charAt(7) == '2' || data.charAt(7) == '4') gender = "여성";
		
		// 2000년대 생 이전 이후 구분하기 위해 변수 생성 (뒷자리 시작번호 1,2 or 3,4)
		Integer centuryCalc = Integer.parseInt(data.substring(7,8));	// 7번째 인덱스부터 8번째 인덱스 전 까지 잘라오기
		
		// 나이 구하기
		String ageString = data.substring(0,2);		// 0번째 인덱스부터 2번째 인덱스 전 까지 잘라오기
		Integer age = Integer.parseInt(ageString);	// 잘라온 문자열을 숫자로 변환
		
		if (centuryCalc == 1 || centuryCalc == 2) {	// 주민번호 뒷자리가 1 또는 2로 시작되면
			age = 2022 - (1900 + age - 1);			// 나이 계산
		}
		if(centuryCalc == 3 || centuryCalc == 4) {	// 3 또는 4이면
			age = 22 -(age - 1);					// 나이 계산
		}
		
		result = age + "세, " + gender + "입니다.";
		return result;
	}

	public static void main(String[] args) {
		
		// 주민등록번호를 전달 받아서 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다
		// 결과는 String.format을 이용하여 나이, 성별을 문자열 형식으로 반환합니다

		String s1 = profile(9305162345678L);	// long
		String s2 = profile("930516-2345678");	// String
		
		System.out.println(s1);	// 30세, 여성입니다
		System.out.println(s2);	// 30세, 여성입니다
	}
}
