package OOP;

public class MusicPlayer {
	boolean isOn = false;
	int volume = 0;
	
	public void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}

	
	void volumeUp() {
		volume += 1;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void volumeDown() {
		volume -= 1;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void showStatus() {
		if (isOn) {
			System.out.println("음악 플레이어 On, 볼롬 : " + volume);
		} else {
			System.out.println("음약 플레이어 OFF");
		}
	}
	
	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
}
