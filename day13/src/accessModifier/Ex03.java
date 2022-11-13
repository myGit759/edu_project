package accessModifier;

class Food{
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Food() {}

	// private 필드의 getter/setter를 자동으로 작성하기
	// source - generate getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


public class Ex03 {
	public static void main(String[] args) {
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
		// 각 객체의 이름과 가격을 printf()를 이용하여 같은 서식으로 출력하세요
		Food jj = new Food("짜장", 4000);
		Food jb = new Food("짬뽕", 5000);
		Food ff = new Food();	// 비어 있는 객체, 값을 담을 수는 있지만 아직 없음
		
		ff.setName("치킨");
		ff.setPrice(20000);
		System.out.println("\t메뉴");
		System.out.printf("%s\t%,d원\n", jj.getName(), jj.getPrice());
		System.out.printf("%s\t%,d원\n", jb.getName(), jb.getPrice());
		System.out.printf("%s\t%,d원\n", ff.getName(), ff.getPrice());
		
		jj = new Food("짜장", 4500);
		System.out.printf("%s\t%,d원\n", jj.getName(), jj.getPrice());
	}
}




























