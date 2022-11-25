package memberManagement;

import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public ArrayList<Member> getlist(){
		return list;
	}
	public void setDummy() {
		if(list.isEmpty()) {
			list.add(new Member("test","1234","테스트",20));
			list.add(new Member("itb","it123","아이티",30));
			list.add(new Member("admin","1","관리자",40));
		}
	}
	
	private boolean isDuplicate(Member ob) {
		for(Member m : list) {
			if(m.getUserid().equals(ob.getUserid())) {
				return true;
			}
		}
		return false;
	}
	
	public int insert(Member ob) {
		if(isDuplicate(ob))	return 0;	// 만약, ob가 중복이면 추가하지 않고, 0을 반환하면서 함수 종료
		
		boolean flag = list.add(ob);
		return flag ? 1 : 0;
	}
	
	public void delete (String userid) {
		for(Member mem : list) {
			if(mem.getUserid().equals(userid)) {
				list.remove(mem);
				return;
			}
		}
	}
	public Member find(String userid) {
		for(Member mem : list) {
			if(mem.getUserid().equals(userid)) {
				return mem;
			}
		}
		return null;
	}
	public void update(Member ob) {
		for(Member mem : list) {
			if(mem.getUserid().equals(ob.getUserid())){
				mem.setUsername(ob.getUsername());
				mem.setUserpw(ob.getUserpw());
				mem.setAge(ob.getAge());
				return;
			}
		}
	}
}










