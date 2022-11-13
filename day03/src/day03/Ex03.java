package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │\n";
		Scanner sc = new Scanner(System.in);
		
		char space = ' ';
		String point = "↑";
		
		System.out.println(bar1 + bar2);
		
		// 0 ~ 30 사이의 정수를 입력받아서, 입력받은 위치에 ↑가 위치하도록 코드를 작성하세요
		System.out.print("정수 입력(0 ~ 30) : ");
		int input = sc.nextInt();
		
		System.out.print(bar1 + bar2);
		
		for(int i = 0;i < input; i++) {
			System.out.print(space);
		}
		System.out.print(point);
		
		sc.close();
	}
}
