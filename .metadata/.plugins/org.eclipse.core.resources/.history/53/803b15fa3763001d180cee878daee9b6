package bestSeller;

import java.util.Scanner;

public class Main {

	static Handler handler;

	public static void main(String[] args) {
		// 더미 데이터 준비
		Book[] arr = {
				new Book("도서","트렌드 코리아 2023", "김난도", "미래의창", 17100, 4,4, 4),	
				new Book("도서","아버지의 해방일지", "정지아", "창비", 13500,4, 4, 4),	
				new Book("만화","주술회전 20 더블특장판", "아쿠타미 게게", "서울미디어코믹스", 5400, 0,0,0)	
			};
		handler = new Handler(arr);
		
		int menu;
		Scanner sc = new Scanner(System.in);
		int result = 0;

		do {
			System.out.println("yes24 베스트셀러");
			System.out.println("1. 책 추가");
			System.out.println("2. 목록");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				Book ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;

			case 2:
				handler.show();
				break;
			case 3:
				handler.show();
				System.out.print("삭제할 번호를 입력하세요 : ");
				handler.delete(Integer.parseInt(sc.nextLine()));
			default :
				break;
			}
			
			System.out.println();
			System.out.println();
		} while (menu != 0);
		sc.close();
	}

	static Book input(Scanner sc) {
		String theme, name, writter, company;
		int reviewCnt, price, contPoint, compPoint;

		System.out.print("테마 : ");
		theme = sc.nextLine();
		System.out.print("제목 : ");
		name = sc.nextLine();
		System.out.print("저자 : ");
		writter = sc.nextLine();
		System.out.print("출판사 : ");
		company = sc.nextLine();
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("리뷰 개수 : ");
		reviewCnt = Integer.parseInt(sc.nextLine());
		System.out.print("내용(☆) : ");
		contPoint = Integer.parseInt(sc.nextLine());
		System.out.print("구성(☆) : ");
		compPoint = Integer.parseInt(sc.nextLine());

		Book ob = new Book(theme, name, writter, company, price, reviewCnt, contPoint, compPoint);
		return ob;
	}
}
