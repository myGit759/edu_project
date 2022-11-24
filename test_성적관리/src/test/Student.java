package test;

public class Student {
	private int idx;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSum() {
		sum = kor + eng + mat;
		return sum;
	}

	public double getAvg() {
		avg = getSum() / 3.0;
		return avg;
	}

	
}
