package OOP;

public class MusicPlayerMain3 {
	public static void main(String[] args) {
		MusicPlayerDate MDate = new MusicPlayerDate();
		
		//음액 플레이어 켜기
		on(MDate);
		
		volumeUp(MDate);
		
		volumeDown(MDate);
		
		showStatus(MDate);
		
		off(MDate);
	}
	
	
	static void on(MusicPlayerDate date) {
		date.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}

	
	static void volumeUp(MusicPlayerDate date) {
		date.volume += 1;
		System.out.println("현재 볼륨 : " + date.volume);
	}
	
	static void volumeDown(MusicPlayerDate date) {
		date.volume -= 1;
		System.out.println("현재 볼륨 : " + date.volume);
	}
	
	static void showStatus(MusicPlayerDate date) {
		if (date.isOn) {
			System.out.println("음악 플레이어 On, 볼롬 : " + date.volume);
		} else {
			System.out.println("음약 플레이어 OFF");
		}
	}
	
	static void off(MusicPlayerDate date) {
		date.isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
}
