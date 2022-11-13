package ex02;

public class Handler {
	
	Student[] arr = new Student[5];

	String showList() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].toStr() + "\n";
			}
		}
		return result;
	}

	int insert(Student ob) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	String search(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(find)) {
				return arr[i].toStr();
			}
		}
		return null;
	}

	int update(String name, String sub, int grade) {
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				switch(sub) {
				case "국어":
					arr[i].kor = grade;
					break;
				case "영어":
					arr[i].eng = grade;
					break;
				case "수학":
					arr[i].mat = grade;
					break;
				}
				arr[i].update();		// 합계와 평균은 생성자에서 생성 될 때 정해진 값으로 
										// 과목 값이 변한다 해도 합계평균이 바뀌지 않음
										// -> 새로 입력된 과목점수로 합계평균을 새로 구해서 덮어쓰기
				return 1;
			}
		}
		return 0;
	}

	int delete(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(find)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}


	// 목록, 추가, 단일검색(이름), 수정, 삭제

}
