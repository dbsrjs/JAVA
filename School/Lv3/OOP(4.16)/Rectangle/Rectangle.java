package OOP.exam;

public class Rectangle {	
	int width = 0;//가로
	int length = 0;//세로
	
	void area() {
		System.out.println("넓이 : " + (width * length));
	}
	
	void round() {
		System.out.println("둘레 : " + ((width * 2) + (length * 2)));
	}
	
	void square() {
		if (width == length) {
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("정사각형이 아닙니다.");
		}
	}
}
