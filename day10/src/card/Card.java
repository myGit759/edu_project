package card;

public class Card {
	char type;	// 다이아, 스페이드, 클로버, 하트
	char num;	// A, 2, 3, 4, 5, 6, ,7, 8, 9, 10, J, Q, K
	
	static int width;	// 카드의 너비
	static int height;	// 카드의 높이

	static String[][] cardFrame() {
		String[][] frame = new String[width][height-1];
		for(int i = 0; i < width; i++) {
			
		}
		int i = 0, j = -1;
		
		
		for(int k = 0; k < width; k++)  {
			frame[i][++j] = "ㅡ";
		}width--;
		for(int k = 0; k < height; k++) {
			frame[++i][j] = "|";
		}height--;	
		for(int k = 0; k < width; k++) {
			frame[i][--j] = "ㅡ";
		}width--;
		for(int k = 0; k < height; k++) {
			frame[--i][j] = "|";
		}height--;	
		return frame;
		
	}
	
	Card(char type, char num) {	// 생성자
		
	}

	
	static void show(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
