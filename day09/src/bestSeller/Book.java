package bestSeller;
//책 테마, 책이름,저자, 출판사, 리뷰개수, 가격, 내용평점(☆), 구성평점(☆)
public class Book {
	String theme;
	String name;
	String writter;
	String company;
	int price;
	int reviewCnt;
	int contPoint;
	int compPoint;
	
	Book(String theme, String name, String writter, String company,int price, int reviewCnt,  int contPoint, int compPoint) {
		this.theme = theme;
		this.name = name;
		this.writter = writter;
		this.company = company;
		this.price = price;
		this.reviewCnt = reviewCnt;
		this.contPoint = contPoint;
		this.compPoint = compPoint;
	}

	void show() {
		String form = "[%s]%s\n%s(%s)\n가격 : %,d원\n리뷰개수 : %d개\n내용(☆) : %d개 / 구성(☆) : %d개";
		form = String.format(form, theme, name, writter, company, price, reviewCnt, contPoint, compPoint);
		System.out.println(form);
	}
}

