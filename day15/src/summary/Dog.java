package summary;

public class Dog extends Animal implements Companion{

	Dog(String name){
		super(name);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String food() {
		return "개껌을";
	}

	@Override
	String getFeed() {
		return "개껌을";
	}



}
