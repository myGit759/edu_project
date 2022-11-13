package student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {
	
	private List<Student> list = new ArrayList<Student>();
	private File f = new File("student.txt");
	private Scanner loader;
	private FileWriter writer;
	
	public Handler() throws IOException{
		if(f.exists()) {
			int cnt = 0;
			loader = new Scanner(f);
			while(loader.hasNextLine()) {
				cnt++;
				String line = loader.nextLine();
				String[] arr = line.split(",");
				String name = arr[0];
				int kor = Integer.parseInt(arr[1]);
				int eng = Integer.parseInt(arr[2]);
				int mat = Integer.parseInt(arr[3]);
				Student st = new Student(name, kor, eng, mat);
				list.add(st);
			}
			loader.close();
			System.out.printf("%d개 데이터 불러오기 완료 !!\n", cnt);
		}
		else {
			System.out.println("불러올 데이터가 없습니다");
		}
	}
	
	public void delete(String name) {
//		// 같은 이름 다 지우기
//		list.removeIf(st -> st.name.equals(name));
		
		if(list.removeIf(st -> st.name.equals(name)))	System.out.println("삭제 성공");
		else										System.out.println("삭제 실패");
		
		
		
//		// 같은 이름 있는지 확인 후 st에 담기(확장 for문)
//		Student st = null;
//		for(Student s : list) {
//			if(s.name.equals(name)) {
//				st = s;
//				break;
//			}
//		}
//		
//		// st가 비어있으면 실패 출력, 내용있으면 list에서 remove하기, 성공 출력
//		if(st != null) {
//			list.remove(st);
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제 실패");
//		}
		
	}
	
	

	public void save() throws IOException{
		writer = new FileWriter(f);
		for(int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			writer.append(st.getFileData());
		}
		writer.flush();
		writer.close();
		System.out.println("저장 완료 !!");
	}
	
	public void showList() {
		for(Student st : list) {
			st.show();
		}
		System.out.println();
	}

	public void insert(Student st) {
		list.add(st);
		
	}
	
	// Comparable 이용해서 정렬하기
	public void sort() {
		list.sort(null);
	}
	
	// Comparator 이용해서 정렬하기
	public void sortByName() {
		list.sort((a, b) -> a.name.compareTo(b.name));	// int 타입으로 반환하기
	}
	
	public void sortBySum() {
		list.sort((a, b) -> a.sum - b.sum);
	}
	
	public void sortByAvg() {
		list.sort((a, b) -> a.avg - b.avg > 0 ? 1 : -1);
	}
	
}
