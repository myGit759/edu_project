package tv;

import java.util.Scanner;

public class TV {
	// TV 클래서를 구성하세요
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 상태 등...
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원 on/off, 음소거 기능 등...
	// 생성자는 객체 생성 시 초기 작동을 담당합니다. (생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter/setter는 사용해도 되고, 생략해도 됩니다
	private boolean power = false;
	private int channel = 2;
	private int volume = 10;
	private boolean mute = false;
	
	public void show() {
		Scanner sc = new Scanner(System.in);
		int select;
		
		do {
			System.out.printf("전원%s\t%s\n", power == false ? "OFF" : "ON", power == false ? "켜기 : 1" : "끄기 : 0");
			if (power == true) {
				if(volume == 0) mute = true;
				System.out.printf("채널 : %s\n볼륨 : %s\n", Integer.toString(channel), mute == false ?  (volume > 19 ? "Max" :Integer.toString(volume)) : "음소거");
				System.out.println();
				System.out.print("채널↑ : 2 | 채널↓ : 3 | 볼륨↑ : 4 | 볼륨↓ : 5 | 음소거 : 6\n");
			}
			System.out.print("입력 : ");
			select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1: power = true;	break;
			case 0: power = false;	break;
			case 2:
				if(channel == 10) {
					channel = 1;
					break;
				}
				channel++;
				break;
			case 3:
				if(channel == 1) {
					channel = 10;
					break;
				}
				channel--;
				break;
			case 4:
				if(volume > 19)	break;
				mute = false;
				volume ++;
				break;
			case 5:
				if(volume == 0) break;
				mute = false;
				volume--;
				break;
			case 6:
				if(mute == true)	mute = false;
				else if(mute == false)	mute = true;
				break;
			}
			System.out.println();
		} while (select != 9);
		sc.close();
	}
}
