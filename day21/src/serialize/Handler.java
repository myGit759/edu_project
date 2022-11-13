package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Handler {
	private ArrayList<Todo> list;
	
	public Handler() throws ClassNotFoundException, IOException {
		load();
		System.out.println("데이터를 불러왔습니다");
	}


	@SuppressWarnings("unchecked")
	private void load() throws IOException, ClassNotFoundException  {	// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		
		FileInputStream fis = new FileInputStream("ex03.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();
	}
	
	public void showList() {
		list.forEach(System.out::println);
	}
	

	public void save() throws  IOException {	// main에서 호출함. 리스트 객체를 파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public void insert(Todo todo) {	// 객체를 전달받아서 추가하기
		list.add(todo);
	}
	
	public int delete(String title) {	// 선택한 객체의 index를 확인하여 제거하기
		for(Todo s : list) {
			if(s.getTitle().equals(title)) {
				list.remove(s);
				return 1;
			}
		}
		return 0;
	}
	
	public void sortByTitle() {
		list.sort((a,b) -> a.getTitle().compareTo(b.getTitle()));
		System.out.println("정렬완료");
	}
	
	public void sortByDate() {
		list.sort((a,b) -> a.getDate().compareTo(b.getDate()));
		System.out.println("정렬완료");
	}
}
