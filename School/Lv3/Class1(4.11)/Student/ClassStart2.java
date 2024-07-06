package Class1;

public class ClassStart2 {

	public static void main(String[] args) {
		String stuNames[] = {"홍길동", "장발장", "임꺽정", "로미오"};
		int stuAges[] = {15, 16, 17, 20};
		int stuGrades[] = {90, 80, 99, 70};			
		
		for (int i = 0; i < stuNames.length; i++) {
			System.out.println("이름: " + stuNames[i] + " 나이: " + stuAges[i] + "세 성적: " + stuGrades[i] + "점");
		}
	}
}
