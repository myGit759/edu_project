package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		Movie t1 = new Movie("블랙아담", "자움 콜렛 세라", "드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 시윈들".split(","),
				"액션", 125, sdf.parse("2022-10-19"), 7.64);
		Movie t2 = new Movie("인생은 아름다워", "최국희", "류승룡,염정아,박세완,옹성우".split(","),"뮤지컬",122,sdf.parse("2020-09-28"),8.36);
		Movie t3 = new Movie("공조2: 인터내셔날", "이석훈", "현빈,유해진,윤아,다니엘 헤니,진선규".split(","), "액션,코미디", 129,sdf.parse("2022-09-07"), 8.02);
		
		Handler.arr[0] = t1;
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
	}
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int menu;
		int result = 0;
		int num, dCNum = 0, dNum;
		String dStr;
		prepareDummy();
		
//		System.out.println(Handler.getList());	// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다

		do {
			System.out.println("1. 목록 추가");
			System.out.println("2. 목록 보기");
			System.out.println("3. 상제 정보");
			System.out.println("4. 검색");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				Movie ob = input(sc);	// input에 형식에 맞춰 내용 추가
				result = Handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
			case 2:
				System.out.println(Handler.getList());
				break;
			case 3:
				System.out.println(Handler.getList());
				System.out.print("번호 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				System.out.println(Handler.getInf(num));
				break;
			case 4:
				System.out.print("검색할 내용 : ");
				String find = sc.nextLine();
				System.out.println(Handler.search(find));
				break;
			case 5:
				System.out.println(Handler.getList());
				System.out.print("삭제방법[1(번호)|2(제목)] :  ");
				if(dCNum == 1) {
					dNum = Integer.parseInt(sc.nextLine());
					result = Handler.delete(dNum);
				}else {
					dStr = sc.nextLine();
					result = Handler.delete(dStr);
				}
				System.out.println(result == 1 ? "삭제 성공" : "삭제 실패");
				break;
			}

		}while(menu != 0);
		sc.close();
		
	}
	static Movie input(Scanner sc) throws ParseException{

		String title;			// 제목
		String director;		// 감독
		String actors;			// 배우
		String genre;			// 장르
		int runningTime;		// 러닝타임
		String openningDate;	// 개봉일자
		double grade;			// 평점
		
		System.out.print("제목 입력 : ");						title = sc.nextLine();
		System.out.print("감독 입력 : ");						director = sc.nextLine();
		System.out.print("출연자 입력(,) : ");					actors = sc.nextLine();
		System.out.print("장르 입력 : ");						genre = sc.nextLine();
		System.out.print("상영시간 입력 : ");					runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("개봉일자 입력(yyyy-MM-dd) : ");		openningDate =sc.nextLine();
		System.out.print("평점 입력 : ");						grade = Double.parseDouble(sc.nextLine());
		
		Movie ob = new Movie(title, director, actors.split(","), genre, runningTime, sdf.parse(openningDate), grade);
		return ob;
	}
}
