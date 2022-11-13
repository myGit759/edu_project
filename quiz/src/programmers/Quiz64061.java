package programmers;

public class Quiz64061 {
	static int solution(int[][] board, int[] moves) {
		
		String stack = "";		// 크레인으로 옮겨진 후 터트려 사라지고 남은 인형들
		String allStack = "";	// 크레인으로 옮겨진 인형들
		int answer = 0;			// 터트려져 사라진 인형의 개수

		for (int i = 0; i < moves.length; i++) {	// 뽑는 라인번호
			int index = moves[i] - 1;				
			for (int k = 0; k < 5; k++) {			
				if (board[k][index] != 0) {			// 라인에 0이 아닐때까지 밑으로 내려가기
					String tmp = String.valueOf(board[k][index]);	// 값이 있으면 임시문자열에 값 담기
					stack += tmp;	// 값을 스택에 저장
					allStack += tmp;	// 전체 확인용 스택에 저장
					board[k][index] = 0;	// 꺼낸 값은 0으로 대입
					if (stack.contains(tmp + tmp)) {	// 만약 스택에 꺼낸 값과 연속된 값이 있다면
						stack = stack.replace(tmp + tmp, "");	// 그 값을 빈 값으로(삭제)
						answer += 2;	// 터진 인형개수(삭제된 값 개수) 2 더하기
					}
					break;
				}
			}
		}

		System.out.println(allStack);
		System.out.println(stack);
		return answer;
	}

	public static void main(String[] args) {
		int[][] board = { 
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 3 }, 
				{ 0, 2, 5, 0, 1 }, 
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } 
				};

		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		int answer = solution(board, moves);
		
		System.out.println(answer == 4);
	}
}