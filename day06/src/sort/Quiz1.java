package sort;

public class Quiz1 {
	public static void main(String[] args) {

		String[] nameArray = { "이지은", "홍진호", "강호동", "이병건", "주호민" };
		int[] ageArray = { 30, 41, 53, 42, 40 };
		System.out.println("목록");
		show(nameArray, ageArray);
		// 1) 나이 순으로 내림차순 정렬 후 출력하세요
		for (int i = 0; i < ageArray.length - 1; i++) {
			for (int j = i + 1; j < ageArray.length; j++) {
				if (ageArray[i] < ageArray[j]) {		// 나이를 선택정렬한 후
					int ageTmp = ageArray[i];			
					ageArray[i] = ageArray[j];
					ageArray[j] = ageTmp;
					String nameTmp = nameArray[i];		// 같은 인덱스번호인 이름까지 같이 정렬 시킨다
					nameArray[i] = nameArray[j];
					nameArray[j] = nameTmp;
				}
			}
		}
		System.out.println("나이(내림차순)");
		show(nameArray, ageArray);

		// 2) 이름 순으로 오름차순 정렬 후 출력하세요
		for (int i = 0; i < nameArray.length - 1; i++) {
			for (int j = i + 1; j < nameArray.length; j++) {
				if (nameArray[i].compareTo(nameArray[j]) > 0) {	// 이름을 선택정렬한 후
					String nameTmp = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = nameTmp;
					int ageTmp = ageArray[i];					// 같은 인덱스 번호인 나이까지 같이 정렬 시킨다
					ageArray[i] = ageArray[j];
					ageArray[j] = ageTmp;
				}
			}
		}
		System.out.println("이름(오름차순)");
		show(nameArray, ageArray);
		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다!!
	}

	
	static void show(String[] nameArray, int[] ageArray) {
		for (int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s : %d살\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
