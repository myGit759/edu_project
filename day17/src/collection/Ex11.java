package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Food implements  Comparable<Food>{
	
	String brand, menu;
	int price;
	
	Food(String brand, String menu, int price){
		this.brand = brand;
		this.menu = menu;
		this.price = price;
	}

	@Override
	public int compareTo(Food o) {
		return o.price - this.price;
	}

	@Override
	public String toString() {
		
		return String.format("브랜드명 : %s\t메뉴 : %s\t금액%,d원", brand, menu, price);
	}
	
}

class MyComp implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		return o1.menu.compareTo(o2.menu);
	}
	
}
public class Ex11 {
	public static void main(String[] args) {
		
		// 메인함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구현하세요
		
		Food f1 = new Food("굽네치킨", "고추바사삭", 21000);
		Food f2 = new Food("BBQ치킨", "황금올리브", 20000);
		Food f3 = new Food("굽네치킨", "깐풍치킨", 22000);
		Food f4 = new Food("네네치킨", "쇼킹핫", 19000);
		Food f5 = new Food("처갓집치킨", "슈프림양념", 21000);
		
		MyComp mc = new MyComp();
		
		List<Food> list = new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		System.out.println("[치킨 List]");
		list.forEach(food -> System.out.println(food));		System.out.println();
		
		// 기본정렬하면 가격 내림차순으로 정렬하기(Comparable)
		list.sort(null);
		System.out.println("[치킨 List] - 가격(내림차순)");
		list.forEach(food -> System.out.println(food));		System.out.println();
		
		// 가격 기준 오름차순으로 정렬하기(Comparator 익명클래스)
		list.sort(new Comparator<Food>() {

			@Override
			public int compare(Food o1, Food o2) {
				return o2.price - o1.price;
			}});
		System.out.println("[치킨 List] - 가격(오름차순)");
		list.forEach(food -> System.out.println(food));		System.out.println();

		// 브랜드 기준 오름차순으로 정렬하기(Comparator 익명클래스(람다식 사용))
		list.sort((o1,o2) -> {return o1.brand.compareTo(o2.brand);});
//(간단)	list.sort((o1,o2) -> o1.brand.compareTo(o2.brand));
		System.out.println("[치킨 List] - 브랜드(오름차순)");
		list.forEach(food -> System.out.println(food));		System.out.println();
		
		//메뉴 오름차순(Comparator 함수형 인터페이스)
		list.sort(mc);
		System.out.println("[치킨 List] - 메뉴(오름차순)");
		list.forEach(food -> System.out.println(food));		System.out.println();
	}
}











