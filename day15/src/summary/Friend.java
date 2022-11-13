package summary;

public class Friend extends Human implements Companion{

	public Friend(String name) {
		super(name);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String food() {
		return "주먹밥을";
	}

}
