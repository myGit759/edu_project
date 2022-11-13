package summary;

public class Human {

	String name;
	
	public Human(String name){
		this.name = name;
	}
	
//	public void give(Animal ob) {
//		System.out.printf("%s이 %s에게 %s 준다\n", name, ob.name, ob.getFeed());
//	}
	
	String feedAction() {
		return "건네";
	}
	
	public void give(Companion c) {
		String method = "";
		if(c instanceof Animal) {
			method = Animal.feedAction();
		}else if (c instanceof Human){
			method = feedAction();
		}
		System.out.printf("%s이 %s에게 %s %s준다\n", name, c.name(), c.food(), method);
	}
	
	
}
