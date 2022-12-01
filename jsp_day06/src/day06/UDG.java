package day06;

import java.util.Random;
//import java.util.Scanner;

public class UDG {
	Random ran = new Random();
	private int count;
	private int num = ran.nextInt(100)+1;
//	private static UDG instance = new UDG();

	
	public String getResult(int cpu, int user) {
		count++;
		String result = "정답!!";
		if(cpu > user) {
			result = "업!";
		}else if(cpu < user) {
			result = "다운!";
		}
		return result;
	}

	
	public int getCount() {
		return count;
	}

	public int getNum() {
		return num;
	}

}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int user;
//		
//		// 랜덤숫자 뽑기
//		int cpu = instance.getNumber();
//		
//		// 입력 및 up down 판별
//		do {
//			System.out.print("1 ~ 100 사이 숫자 입력 : ");
//			user = sc.nextInt();
//			System.out.println(instance.getResult(cpu, user));
//		}while(cpu != user);
//		System.out.println("도전 횟수 : "+instance.count);
//		
//		sc.close();
//		
//		
//	}


