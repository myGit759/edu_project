package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 클래스 대신 Map을 이용하기

public class Ex05 {
	public static void main(String[] args) {
		
		HashMap<String, Object> p1 = new HashMap<String, Object>();
		p1.put("name", "이지은");
		p1.put("age", 30);
		
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "홍진호");
		p2.put("age", 41);
		
		HashMap<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name", "나단비");
		p3.put("age", 5);
		
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		
		// List<HashMap> list;
		for(int i = 0 ; i < list.size(); i++) {
			System.out.printf("%d번째 사람의 이름은 %s\n", i, list.get(i).get("name"));
			System.out.printf("%d번째 사람의 나이는 %s\n", i, list.get(i).get("age"));
			System.out.println();
		}	
	}
}














