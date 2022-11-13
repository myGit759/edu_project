package programmers;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        
        answer = new long[n];
    	int tmp = x;
        for(int i = 0; i < answer.length;i++) {
        	answer[i] = x;
        	x += tmp;
        }
        return answer;
    }
}

