package programmers;

import java.util.Arrays;

public class Quiz42576_2 {
	static String solution(String[] participant, String[] completion) {
		
		String answer = "";
	    Arrays.sort(participant);	// p 정렬
	    Arrays.sort(completion);	// c 정렬
	    int dup = 0;
	        
	    for(int i = 0; i < completion.length; i++) {	// c길이 만큼 반복
	    	if(!participant[i].equals(completion[i])) {	// 인덱스 안 문자열이 같지 않다면	
	    		answer = participant[i];				// p인덱스값 반영(c인덱스는 완주자만 정렬되어있기 때문)
	    		if(participant[i].equals(participant[i-1])) {
	    			dup = 1;
	    		}  			
	    	}
	    }
	    if(!answer.equals("")) {
	    	if(dup == 1) {
	    		answer += "는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.";
	    		return answer;
	    	}else {
	    		answer += "는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.";
	    		return answer;
	    	}
	    }
	    answer = participant[participant.length-1];
	    
	    for(int i = 1; i < participant.length;i++) {
	    	if(participant[i].equals(participant[i-1])) {
				dup = 1;
	    	}
	    }
	    if(dup == 1) {
    		answer += "는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.";
    		return answer;
    	}else {
    		answer += "는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.";
    		return answer;
    	}
	    

	    
//	    answer = participant[participant.length-1];		// c인덱스값 끝까지 비교하고 이상없을때
	    								// p마지막 인덱스 값 리턴(p인덱스 값이 더 길기 때문)
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
