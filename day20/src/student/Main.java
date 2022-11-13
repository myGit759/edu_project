package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();	// 생성자에서 파일을 읽어들인다
		
//		handler.showList();
		
		int select, kor, eng, mat;
		String name;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬<내림차순>");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("이름 : ");		name = sc.nextLine();
				System.out.print("국어점수 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어점수 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학점수 : ");	mat = Integer.parseInt(sc.nextLine());
				Student st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
			case 3:
				System.out.print("삭제할 학생의 이름 입력 : ");
				handler.delete(sc.nextLine());
				break;
			case 4:
				System.out.println("1. 이름순 | 2. 합계순  | 3. 평균순");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) handler.sortByName();
				if(select == 2) handler.sortBySum();
				if(select == 3) handler.sortByAvg();
//				handler.sort();
				System.out.println("정렬 성공");
				break;
			case 0:
				handler.save();	// 메인이 종료되기 직전 저장한다
				break;
			}
		}while(select != 0);
		sc.close();
	}
}
