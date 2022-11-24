package test;

import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Student> list = new ArrayList<Student>();
	private int idx = 0;
	
	public Handler() {
		Student ob1 = new Student();
		ob1.setIdx(nextIdx());
		ob1.setName("정철현");
		ob1.setKor(99);
		ob1.setEng(89);
		ob1.setMat(95);
		list.add(ob1);
		
		Student ob2 = new Student();
		ob2.setIdx(nextIdx());
		ob2.setName("이지은");
		ob2.setKor(80);
		ob2.setEng(89);
		ob2.setMat(99);
		list.add(ob2);
	}
	
	private int nextIdx() {
		idx++;
		return idx;
	}
	
	public ArrayList<Student> getList(){
		return list;
	}
	
	public void insert(Student st) {
		list.add(st);
	}
	
	public void delete(String[] values) {
		for(String s : values) {
			list.removeIf(st -> st.getName().equals(s));
		}
	}
	public void update(Student ust) {
		for(Student st : list) {
			if(st.getName().equals(ust.getName())) {
				st.setKor(ust.getKor());
				st.setEng(ust.getEng());
				st.setMat(ust.getMat());
			}
		}
	}
	
}
