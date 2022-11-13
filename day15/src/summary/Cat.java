package summary;

public class Cat extends Animal implements Companion{
	

	Cat(String name){
		super(name);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String food() {
		return "츄르를";
	}

	@Override
	String getFeed() {
		return "츄르를";
	}

}
