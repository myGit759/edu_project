package phoneBook;

import java.util.ArrayList;

public class Handler {
	
	private ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
	private int idx = 0;
	
	private int nextIdx() {
		return ++idx;
	}
	public Handler() {
		if(list.isEmpty()) {
			list.add(new PhoneBook(nextIdx(),"조규성", "010","1234","5678"));
			list.add(new PhoneBook(nextIdx(),"김진수", "010","8546","1848"));
			list.add(new PhoneBook(nextIdx(),"손흥민", "010","5498","9154"));
		}
	}
	
	public ArrayList<PhoneBook> getList(){
		return list;
	}
	
	public void insert(PhoneBook ob) {
		ob.setIdx(nextIdx());
		list.add(ob);
	}
	
	public PhoneBook getItem(int idx) {
		for(PhoneBook pb : list) {
			if(pb.getIdx() == idx) {
				return pb;
			}
		}
		return null;
	}
	
	
	public int modify(PhoneBook ob) {
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getIdx() == ob.getIdx()) {
				idx = i;
				break;
			}
		}
		list.set(idx, ob);
		return idx;
	}
	public void delete(String[] idx) {
		for(String s : idx) {
			list.removeIf(pb -> pb.getIdx() == Integer.parseInt(s));
		}
	}
}




















