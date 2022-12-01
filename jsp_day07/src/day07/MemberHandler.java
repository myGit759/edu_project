package day07;

import java.util.ArrayList;
import java.util.stream.Collectors;

// 상세 기능 및 데이터 유지
// 함수 중심, 데이터를 어떤 방식(method)으로 처리할 것 인가?

public class MemberHandler {

	private ArrayList<Member> list = new ArrayList<Member>();
	
	
	
	public MemberHandler() {
		setDummy();
	}
	private void setDummy() {
		list.add(new Member("cjfgus01","cjfgus01PW", "정철현1", 28,"1995-05-30"));
		list.add(new Member("admin","admin2@", "관리자", 25,"1998-11-28"));
		list.add(new Member("cjfgus03","cjfgus03PW", "정철현3", 30,"1993-07-16"));
	}
	
	public ArrayList<Member> getList(){
		return list;
	}
	public boolean isDuplicate(Member ob) {
		for(Member mem : list) {
			if(mem.getUserid().equals(ob.getUserid())) {
				return true;
			}
		}
		return false;
	}
	public int insert(Member ob) {
		if(isDuplicate(ob)) {
			return 0;
		}
		list.add(ob);
		return 1;
	}
	
//	int dupSize = list.stream()								 // (리스트의 스트림을 호출하여)
//			.filter(m -> m.getUserid().equals(user.getUserid())) // 필터(아이디가 일치하는 요소만 남긴다)
//			.collect(Collectors.toList()).size();		// 다시 리스트로 변환하여, 사이즈를 int형으로 저장한다
	
	public Member login(Member user) {
		Member login = null;
		// 리스트에서 id와 pw가 일치하는 계정이 있으면 login 변수에 저장한다
		
		for(Member mem : list) {
			if(mem.getUserid().equals(user.getUserid()) && mem.getUserpw().equals(user.getUserpw())) {
				login = mem;
			}
		}
		return login;
	}
	
	public int modify(Member user) {
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserid().equals(user.getUserid())) {
				idx = i;
			}
		}
		list.set(idx, user);
		return idx;
	}
}















