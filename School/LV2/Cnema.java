import java.util.Scanner;

public class Cnema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 영화 예매 프로그램
		// 2차원 배열 사용
		
		// 남은 좌석 보기
		// 좌석 예매
		// 예매 확인
		// 종료
		
		System.out.println("\r\n" + 
				"                                         __  __         ______                                              \r\n" + 
				"                                        /  |/  |       /      \\                                             \r\n" + 
				"  _______  __    __  _______    ______  $$/ $$ |      /$$$$$$  | _______    ______   _____  ____    ______  \r\n" + 
				" /       |/  |  /  |/       \\  /      \\ /  |$$ |      $$ |  $$/ /       \\  /      \\ /     \\/    \\  /      \\ \r\n" + 
				"/$$$$$$$/ $$ |  $$ |$$$$$$$  |/$$$$$$  |$$ |$$ |      $$ |      $$$$$$$  |/$$$$$$  |$$$$$$ $$$$  | $$$$$$  |\r\n" + 
				"$$      \\ $$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |$$ |      $$ |   __ $$ |  $$ |$$    $$ |$$ | $$ | $$ | /    $$ |\r\n" + 
				" $$$$$$  |$$ \\__$$ |$$ |  $$ |$$ \\__$$ |$$ |$$ |      $$ \\__/  |$$ |  $$ |$$$$$$$$/ $$ | $$ | $$ |/$$$$$$$ |\r\n" + 
				"/     $$/ $$    $$/ $$ |  $$ |$$    $$ |$$ |$$ |      $$    $$/ $$ |  $$ |$$       |$$ | $$ | $$ |$$    $$ |\r\n" + 
				"$$$$$$$/   $$$$$$/  $$/   $$/  $$$$$$$ |$$/ $$/        $$$$$$/  $$/   $$/  $$$$$$$/ $$/  $$/  $$/  $$$$$$$/ \r\n" + 
				"                              /  \\__$$ |                                                                    \r\n" + 
				"                              $$    $$/                                                                     \r\n" + 
				"                               $$$$$$/                                                                      \r\n" + 
				"");
		
		String[][] set = new String[5][5];
		while(true){
			
			System.out.println("남은 좌석 확인(1) / 좌석 예매하기(2) / 예매 확인하기(3) / 종료하기(4)");
			int who = sc.nextInt();			
			switch (who) {
			case 1:
				System.out.println("------------- 남은 좌석 확인 -------------");
				for (int i = 0; i < set.length; i++) {
					for (int j = 0; j < set.length; j++) {
						if(set[i][j] == null) {
							System.out.printf("□  ");							
						} else {
							System.out.println("■  ");
						}
					}
					System.out.println();
				}
				System.out.println("--------------------------------------");
				System.out.println();
				break;
				
			case 2:
				System.out.println("------------- 좌석 예매 하기 -------------");
				System.out.println();
				
				System.out.println("몇 행?");
				int row = sc.nextInt();
				
				System.out.println("몇 열?");
				int col = sc.nextInt();
				if ((row>=0 && row<5) && (col>=0 && col<5)) {					
					System.out.println("이름?");
					String name = sc.next();
					
					if (set[row][col] == null) {
						set[row][col] = name;
						System.out.println("예매가 완료되었습니다.");
					} else {
						System.out.println("이미 선택된 좌석입니다. 다시 시도해주세요.");					
					}
				} else {
					System.out.println("다시 입력해주세요.");
				}
				break;
				
			case 3:
				System.out.println("------------- 좌석 예매 확인 -------------");
				System.out.println("예약자의 성명을 입력해주세요.");
				String rsv = sc.next(); 
				
				for (int i = 0; i < set.length; i++) {
					for (int j = 0; j < set.length; j++) {
						if(set[i][j] == rsv) {
							System.out.println("좌석" +i+ "행" +j+ "열 입니다.");
						} else {
							System.out.println("해당 성명을 가진 예약자가 존재하지 않습니다.");
						}						
					}
				}
					System.out.println();
				
				break;
			case 4:
				System.out.println("------------- 프로그램 종료 -------------");
				System.exit(0);
				break;
			default :
				System.out.println("오류 발생");
			}
		}		
	}
}
