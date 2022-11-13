package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
		
		Handler handler = new Handler();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Scanner sc = new Scanner(System.in);
		int select, result;
		String title;
		Date d;
		
		
		do {
			System.out.println("\n1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬<내림차순>");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(select) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("추가할 제목 입력 : ");
				title = sc.nextLine();
				System.out.print("날짜 입력(yyyy.MM.dd) : ");
				d = sdf.parse(sc.nextLine());
				handler.insert(new Todo(title,d));
				System.out.println("추가 성공!");
				break;
			case 3:
				System.out.print("삭제할 제목 입력 : ");
				title = sc.nextLine();
				result = handler.delete(title);
				if(result == 1)	System.out.println("삭제 성공");
				if(result == 0)	System.out.println("삭제 실패");
				break;
			case 4:
				System.out.print("정렬 순서 (1. 제목 순 | 2. 날짜 순) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1)	handler.sortByTitle();
				if(select == 2)	handler.sortByDate();
				break;
			case 0:
				handler.save();
				System.out.println("저장 완료 !!");
				break;
			}
		}while(select != 0);
		sc.close();
	}
}
