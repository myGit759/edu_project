package ex01;

//Data Transfer Object
//Value Object

public class Human {

	String name;	// 여러 Human 객체를 구분하기 위한 기준값으로 name을 선택했음
					// name은 다른 Human의 name과 같은 값을 가질 수 없다
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String toStr() {
		String str = String.format("이름 : %s, 나이 : %d살", name, age);
		return str;
	}
}
