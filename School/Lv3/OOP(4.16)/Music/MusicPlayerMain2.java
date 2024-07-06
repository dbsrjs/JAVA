package OOP;

public class MusicPlayerMain2 {
	public static void main(String[] args) {
		MusicPlayerDate MDate = new MusicPlayerDate();
		
		//음액 플레이어 켜기
		MDate.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
		
		//볼륨 증가
		MDate.volume++;
		System.out.println("현재 볼륨 : " + MDate.volume);
		
		MDate.volume++;
		System.out.println("현재 볼륨 : " + MDate.volume);
		
		MDate.volume--;
		System.out.println("현재 볼륨 : " + MDate.volume);
		
		//음악 플레이어 상태
		if (MDate.isOn) {
			System.out.println("음악 플레이어 On, 볼롬 : " + MDate.volume);
		} else {
			System.out.println("음약 플레이어 OFF");
		}
		
		//음악 플레이어 그기
		MDate.isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
}
