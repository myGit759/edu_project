package day03;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int current;
		
		Integer [] elevators = {
				ran.nextInt(15) + 1,
				ran.nextInt(15) + 1,
				ran.nextInt(15) + 1,
		};
		
		List<Integer> el = Arrays.asList(elevators);	// 배열을 리스트로 변환
		System.out.println(el);
		
		System.out.print("현재 층수를 입력하세요 : ");
		current = sc.nextInt();
		
		int min = 15;		// 최솟값을 저장할 변수
		int index = 0;		// 최솟값은 몇 번째 위치에 있는지 저장 할 변수
		for(int i = 0; i < el.size(); i++) {
			int dist = Math.abs(current - el.get(i));	// 절댓값을 구하여 거리를 만들어주고
			if(min > dist) {	// 거리의 최솟값이 몇 번째인지에 따라
				index = i;		// index변수에 i값을 저장
			}
		}
		
		System.out.printf("%d번째 엘리베이터가 움직입니다\n", index + 1);
		sc.close();
	}
}
