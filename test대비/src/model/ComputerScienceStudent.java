package model;

public class ComputerScienceStudent extends Student{

	private int java;
	private int network;
	private int linux;
	
	
	public ComputerScienceStudent(String name, int kor, int eng, int mat, int java, int network, int linux) {
		super(name, kor, eng, mat);
		this.java = java;
		this.network = network;
		this.linux = linux;
		
	}


	@Override
	public int getSum() {
		 sum = kor + eng + mat + java + network + linux;
		 return sum;
	}


	@Override
	public double getAvg() {
		avg = sum / 6.0;
		return avg;
	}


	@Override
	public void showInfo() {
		System.out.printf("[컴퓨터공학] 이름 : %s, 합계 : %d, 평균 : %.2f\n", name, getSum(), getAvg());
	}

	@Override
	public void showDetail() {
		System.out.println("[컴퓨터공학]");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("자바 : " + java);
		System.out.println("네트워크 : " + network);
		System.out.println("리눅스 : " + linux);
		System.out.println("합계 : " + getSum());
		System.out.printf("평균 : %.2f\n", getAvg());
		System.out.println();
	}


}
