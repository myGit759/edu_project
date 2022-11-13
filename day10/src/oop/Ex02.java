package oop;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		// oop.Number 클래스(Ex01)를 사용하여 객체의 배열 생성
		
		Number[] arr = new Number[12];
		
		// 배열(Number를 저장할 수 있는 참조변수 12개)만 생성했을 뿐,
		// Number타입의 객체(실체)는 아직 없다
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		} // 모든 칸이 비어있다
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Number(i+1);
		} // 각 칸에 i +1값으로 객체를 생성한다
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		} // 모든 칸이 비어있다
		
		Random ran = new Random();
		int n = ran.nextInt(4);
		Number cpu = arr[n];
		
		int m = ran.nextInt(4);
		Number you = arr[n]; 
	}
}
