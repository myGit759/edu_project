package array;

public class Quiz1 {
	static void guide(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		
		guide(arr);
		
		int num = 1;	// 시작 번호
		int i = 0;		// arr[i][j]초기값 설정
		int j = 0;
		int width = 5;	// 가로 이동량
		int height = 4;	// 세로 이동량
		
		while (num <= 25) {	// num이 25가 되면 종료
			
			for(int k = 0; k < width; k++) {	// (현재 i,j위치 : (0,0) / 가로 이동량(5)만큼 
				arr[i][j] = num;				// [0][0]부터 번호 넣고
				j++;num++;						// j값 증가, 번호 증가	
			}width--;i++;j--;					// (현재 i,j위치 : (0,5) / 가로 이동량 1 감소하기, i값 한칸 올리기, j값 한칸 내리기 
			
			for(int k = 0; k < height; k++) {	// (현재 i,j위치 : (1,4) / 세로 이동량(4)만큼
				arr[i][j] = num;				// [1][4]부터 번호 넣고
				i++;num++;						// i값 증가, 번호 증가
			}height--;i--;j--;					// (현재 i,j위치 : (5,4) / 세로 이동량 1 감소하기, i값 한칸 내리기, j값 한칸 내리기
			
			for(int k = 0; k < width; k++) {	// (현재 i,j위치 : (4,3) / 가로 이동량(4)만큼
				arr[i][j] = num;				// [4][3]부터 번호 넣고
				j--;num++;						// j값 감소, 번호 증가
			}width--;j++;i--;					// (현재 i,j위치 : (4,-1) / 가로 이동량 1 감소하기, i값 한칸 내리기, j값 한칸 올리기
			
			for(int k = 0; k < height; k++) {	// (현재 i,j위치 : (3,0) / 세로 이동량(3)만큼
				arr[i][j] = num;				// [3][0]부터 번호 넣고
				i--;num++;						// i값 감소, 번호 증가
			}height--;i++;j++;					// (현재 i,j위치 : (0,0) / 세로 이동량 1 감소하기, i값 한칸 올리기, j값 한칸 올리기
			
		}										// num이 25가 될 때까지 반복
		show(arr);
	}
}
