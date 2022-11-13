package bestSeller;

public class Handler {

	Book[] arr = new Book[20];
	
	// 생성자에 따라서, 배열에 더미 데이터를 미리 넣을 수 있도록 설정해보기
	Handler() {
		System.out.println("기본 생성자로 객체 생성 (더미 데이터 없음)");
	}
	
	Handler(Book[] arr){
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
	}
	
	// 추가 함수
	int insert(Book ob) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	// 삭제 함수(번호로 받아서 삭제)
	void delete(int num) {
		if (arr[num - 1] != null) {
			arr[num - 1] = null;
			System.out.println("삭제 완료!");
			for (int i = 0; i < arr.length; i++) {
				if (i != arr.length -1) {
					if (arr[i] == null) {
						arr[i] = arr[i + 1];
						arr[i + 1] = null;
					}
				}else break;
			}
		} else {
			System.out.println("삭제 실패");
		}
	}
	
	// 목록 함수
	void show() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.print((i + 1) + ".");
				arr[i].show();
				System.out.println();
			}
		}
	}

}
