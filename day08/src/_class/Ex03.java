package _class;

class Coffee{
	// 문자열 형태의 커피 메뉴 이름
	String name;
	
	// 정수 형태의 커피 가격
	int cost;
	
	// 생성자 : 객체 생성시 호출되는 함수, 클래스의 이름과 똑같고, 반환형 자체가 없다(void도 쓰지 않는다)
	// 생성자는 작성하지 않으면, JVM이 컴파일 할 때 기본 생성자 코드를 작성해준다
	// 개발자가 생성자를 작성하면, JVM은 자동으로 생성자를 만들어주지 않는다
	// 생성자도 함수이므로, 자바의 함수 오버로딩이 적용된다
	
	Coffee(String name, int cost){
		this.name = name;	// 매개변수 name의 값을 이 객체의 멤버 핑드 name에 대입한다
		this.cost = cost;
	}
	
	// void 반환형으로 이름과 가격을 출력하는 show()
	void show() {
		System.out.printf("%s : %,d원\n", name, cost);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		// Coffee 클래스를 이용하여 3개의 서로 다른 객체를 생성합니다
		Coffee menu1 = new Coffee("아메리카노",2000);
		Coffee menu2 = new Coffee("카페라떼", 2500);
		Coffee menu3 = new Coffee("토피넛라떼", 3500);
		
		// 각 객체마다, 이름과 가격을 일일히 넣어주어야 한다
//		menu1.name = "아메리카노";
//		menu1.cost = 2000;
//		
//		menu2.name = "카페라떼";
//		menu2.cost = 3000;
//		
//		menu3.name = "카푸치노";
//		menu3.cost = 3500;
		
		// 서로 다른 객체 3개를 Coffee 배열에 저장합니다
		Coffee[] arr = { menu1, menu2, menu3 };
		
		// 반복문을 이용하여 각 객체의 show() 함수를 호출합니다
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		
		
	}
}
