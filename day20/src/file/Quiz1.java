package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws IOException {
		
		// C:\\20221110\\e.txt 파일을 생성하고
		// Scanner를 이용하여 키보드로 문자열을 입력받아서
		// 입력받은 문자열을 대상 파일에 기록하는 코드를 작성하세요
		// 단, 파일에 기록이 이루어질 때마다 현재 시간을 기록하게 하고
		// 내용이 변경되는것이 아니라 추가되게끔 설정해보세요
		
		// 표준 입력 -> 프로그램 -> 파일 출력
		
		Scanner sc = new Scanner(System.in);
		
		File f = new File("C:\\20221110","e.txt");
		
		FileOutputStream fos = new FileOutputStream(f, true);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		String now = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date());
		
		bw.append(s + "\n");
		bw.append("입력 시간 : " + now + "\n\n");
		
		
		bw.flush();
		bw.close();
		sc.close();
		System.out.println("입력 완료");
	}
}
