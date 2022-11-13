package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// 웹 상의 이미지 주소를 작성
		String path = "https://postfiles.pstatic.net/MjAyMTA4MTJfNTkg/MDAxNjI4NzUwMzk5MjIw.UgdXf0tYgGooZbhTOC_UWVbCtx_xN2h_rXv225AOs9Yg.u3GqRV8GWCBMGGGBaCnpSNmEu9Xk9ahKgQvgqjKIWP8g.JPEG.ttoa1109/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%ED%8C%8C%EC%9D%BC%EF%BC%8D35.jpg?type=w966";
		URL url = new URL(path);
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream("ㅋaㅋ.jpg");
		
		byte[] buffer = new byte[16];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
	}
}
