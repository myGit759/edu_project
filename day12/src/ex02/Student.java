package ex02;

public class Student {
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	// 생성자는 name, kor, eng, mat만 받는다
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor + eng + mat;
		this.avg = sum / 3.0;
	}
	
	// 모든 Student의 객체는 반드시 이름과 국영수를 포함해야 한다
	// 값을 전달하지 않고서는 절대로 객체를 생성할 수 없다
	
	public String toStr() {
		String str = String.format("이름 : %s\n국어 : %d점\n영어 : %d점\n수학 : %d점\n합계 : %d점, 평균 : %.2f점\n",name, kor, eng, mat, sum, avg);
		return str;
	}
	void update() {
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
	}
}

