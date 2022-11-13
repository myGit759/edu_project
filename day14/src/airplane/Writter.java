package airplane;

public class Writter extends Human{
	Writter(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.printf("%s(작가)\n", name);
	}

}
