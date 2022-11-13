package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		
		int select, row;
		String result, find, title, part;
		
		do {
			System.out.println("1.목록");
			System.out.println("2.추가");
			System.out.println("3.검색");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("0.종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				result = hd.showSimpleList();
				System.out.println(result);
				break;
			case 2:
				Movie input = input(sc);
				row = hd.insert(input);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			case 3:
				System.out.print("검색할 단어 : ");
				find = sc.nextLine();
				result = hd.search(find);
				System.out.println(result != null ? result : "결과가 없습니다");
				break;
			case 4:
				System.out.print("수정할 영화이름 : ");
				title = sc.nextLine();
				System.out.print("수정할 파트 : ");
				part = sc.nextLine();
				System.out.print("수정할 내용 : ");
				result = sc.nextLine(); 
				row = hd.update(title, part, result);
				System.out.println(row == 1 ? "수정 성공" : "수정 실패"); 
				break;
			case 5:
				System.out.print("삭제할 제목 : ");
				title = sc.nextLine();
				row = hd.delete(title);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패"); 
				break;
			}
		}while(select != 0);
		sc.close();
		
	}

	static Movie input(Scanner sc) throws ParseException {
		String title;
		String director;
		String[] actors;
		int runningTime;
		Date openningDate;
		double rating;
		
		System.out.print("제목 입력 : ");						title = sc.nextLine();
		System.out.print("감독 입력 : ");						director = sc.nextLine();
		System.out.print("출연자 입력(,) : ");					actors = sc.nextLine().split(",");
		System.out.print("상영시간 입력 : ");					runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("개봉일자 입력(yyyy-MM-dd) : ");		openningDate = sdf.parse(sc.nextLine());
		System.out.print("평점 입력 : ");						rating = Double.parseDouble(sc.nextLine());
		
		Movie ob = new Movie(title, director, actors, runningTime, openningDate, rating);
		return ob;
	}
}
