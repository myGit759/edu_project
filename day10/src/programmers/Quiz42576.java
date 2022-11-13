package programmers;

import java.util.Arrays;

public class Quiz42576 {
	static String solution(String[] participant, String[] completion) {
		
		String answer = "";
	    Arrays.sort(participant);	// p 정렬
	    Arrays.sort(completion);	// c 정렬
	        
	    for(int i = 0; i < completion.length; i++) {	// c길이 만큼 반복
	    	if(!participant[i].equals(completion[i])) {	// 인덱스 안 문자열이 같지 않다면	
	    		answer = participant[i];				// p인덱스값 반영(c인덱스는 완주자만 정렬되어있기 때문)
	    		return answer;
	    }
	    }
	    answer = participant[participant.length-1];		// c인덱스값 끝까지 비교하고 이상없을때
	    return answer;									// p마지막 인덱스 값 리턴(p인덱스 값이 더 길기 때문)
	}
	
	public static void main(String[] args) {
	
		String[] p1 = {"leo", "kiki", "eden"};
		String[] c1 = {"eden", "kiki"};
		
		String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] p3 = {"mislav", "stanko", "mislav", "ana"};
		String[] c3 = {"stanko", "ana", "mislav"};
		
		
		System.out.println(solution(p1,c1));
		System.out.println(solution(p2,c2));
		System.out.println(solution(p3,c3));
	}
}
