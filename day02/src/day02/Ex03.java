package day02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		// 이미지 파일 주소 저장
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20101106_60%2Fyjlcu_1288973979613Jr6Vj_JPEG%2Fjminsu98_26324311_borisunde.jpg&type=a340";
		// 버퍼입력값, 파일출력값 초기화 
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			bis = new BufferedInputStream(new URL(path).openStream());
			fos = new FileOutputStream(new File("my.jpg"));
			
			// 버퍼크기 지정
			byte[] buffer = new byte[1024];	// 버퍼 1바이트씩 처리하면 함수호출이 너무 많다
			int count, total = 0;			// 일정한 크기만큼 데이터를 모아서 한 번에 처리한다
			
			//
			while((count = bis.read(buffer, 0, 1024)) != -1)/*<- end of file 뜻*/ {
				total += count;
				System.out.println(total);
				fos.write(buffer, 0, count);
			}
		} finally {
			bis.close();
			fos.close();
		}
		System.out.println("끝");
		
	}
}
