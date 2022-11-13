package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		Student ob;
		int select, row, grade, kor, eng, mat;
		String find, name, result, sub;
		System.out.println();
		Student st = new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
		System.out.println(st.toStr());
		do {
			System.out.println("학생 성적 관리프로그램\n\n");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:	// 목록
				result = hd.showList();
				System.out.println(result);
				break;
			case 2:	// 추가 
				System.out.print("이름 입력 : ");
				name = sc.nextLine();						
				System.out.print("국어점수 입력 : ");
				kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어점수 입력 : ");
				eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학점수 입력 : ");
				mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);
				row = hd.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			case 3:	// 이름으로 검색
				System.out.print("검색할 이름 입력 : ");
				find = sc.nextLine();
				result = hd.search(find);
				System.out.println(result != null ? result : "결과가 없습니다");
				break;
			case 4:	// 수정
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("수정할 과목 입력 : ");
				sub = sc.nextLine();
				System.out.print("점수 입력 : ");
				grade = Integer.parseInt(sc.nextLine());
				row = hd.update(name, sub, grade);
				System.out.println(row == 1 ? "수정 완료" : "수정 실패");				
				break;
			case 5:	// 삭제
				System.out.print("삭제할 이름 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
			
		}while(select != 0);
		sc.close();
	}
}
