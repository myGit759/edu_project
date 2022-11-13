package day03;

public class Ex02 {
	public static void main(String[] args) {
		
		// 대문자 A부터 Z까지 한줄에 출력하세요
		// 각 글자는 , 로 구분하고 마지막에는 콤마가 없어야 합니다.
		
		// i를 아스키코드 A(65)로 설정
		int i = 65;
		
		while(true) {
			//  출력 후(%c를 출력 -> 문자출력)1씩 증가
			System.out.printf("%c", i);
			i++;
			
			// i가 아스키코드 Z를 넘어가면 종료(콤마 전에 break함으로써 마지막은 콤마 출력 안되게 설정)
			if(i == 91) {
				break;
			}
			
			// 사이에 콤마 설정
			System.out.print(", ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		// 문자로 바로 설정 version
		char ch = 'A';
		
		while(true) {
			//  출력후 1씩 증가
			System.out.printf("%c", ch);
			ch++;
			
			// ch가  Z를 넘어가면 종료(콤마 전에 break함으로써 마지막은 콤마 출력 안되게 설정)
			if(ch > 'Z') {
				break;
			}
			
			// 사이에 콤마 설정
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
			if(c == 'Z') {
				System.out.print("\n");
			}else {
				System.out.print(", ");
			}
		}
	}
}
