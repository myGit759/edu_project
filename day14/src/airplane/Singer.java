package airplane;

public class Singer extends Human{
	Singer(String name){
		super(name);
	}
	@Override
	void show() {
		System.out.printf("%s(가수)\n", name);
	}
	
}
