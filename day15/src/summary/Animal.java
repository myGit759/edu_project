package summary;

public abstract class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	static String feedAction() {
		return "던져";
	}
	abstract String getFeed();
}