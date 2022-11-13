package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("C:\\20221110\\ex06.txt"));
		List<Person> list = new ArrayList<Person>();
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			line = line.replace("이름 : ", "").replace("나이 : ", "").replace("살","").replace(" ", "");
			String[] arr = line.split(",");
			
			Person p = new Person(arr[0], Integer.parseInt(arr[1]));
			list.add(p);
		}
		sc.close();
		
		list.forEach(p -> System.out.println(p));
		System.out.println();
		
		FileWriter fw = new FileWriter("C:\\20221110\\ex10.txt");
		
		for(Person p : list) {
			fw.write(p.toString() + "\n");
		}
		fw.flush();
		fw.close();
		System.out.println("끝");
	}
}
