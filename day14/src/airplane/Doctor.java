package airplane;

public class Doctor extends Human{
	Doctor(String name){
		super(name);
	}
	
	void heal(Human other) {
		System.out.println(other.name + "님 치료");
	}
	
	@Override
	void show() {
		System.out.printf("%s(의사)\n", name);
	}
}
