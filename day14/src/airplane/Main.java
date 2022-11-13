package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();

		Human h1 = new Singer("이지은");
		Human h5 = new Singer("거미");
		Human h6 = new Writter("주호민");
		Human h4 = new Writter("이병건");
		Human h3 = new Doctor("이국종");
		Human h2 = new Doctor("조정석");
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이 때, 최소 2명의 의사를 포함시킵니다
		System.out.println();
		air.entrance(h1);
		air.entrance(h2);
		air.entrance(h3);
		air.entrance(h4);
		air.entrance(h5);
		air.entrance(h6);
		System.out.println();
		
		int emer = air.emergency();
		System.out.println();
		
		System.out.println("승객 직업찾기");
		for(int i = 0; i <air.arr.length; i++) {
			air.arr[i].show();
			if(air.arr[emer] != air.arr[i] && air.arr[i] instanceof Doctor) {
				Doctor d = (Doctor)air.arr[i];
				System.out.printf(d.name + "님이 ");
				d.heal(air.arr[emer]);
				break;
			}
		}
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
	}
}
