package ddd;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class awr1 {
	public static void main(String[] args) throws IOException {

		URL url = new URL("https://mgr.kgitbank.com");
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		Scanner sc3 = new Scanner(in);
		
		while(sc3.hasNextLine()) {
			String line2 = sc3.nextLine();
			System.out.println(line2);
		}
		System.out.println("close");
		sc3.close();
	}
}
