package Class1;

public class ClassStart5 {

	public static void main(String[] args) {
		//리팩토링
		//1. 선언 단일화(배열로만 접근)
		//2. 출력 문구를 반복문을 통해 심플하게 변경
		
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
		
		students[0].stuName = "홍길동";
		students[0].stuAge = 15;
		students[0].stuGrade = 90;
		
		students[1].stuName = "장발장";
		students[1].stuAge = 16;
		students[1].stuGrade = 80;
		
		for (int i = 0; i < students.length; i++) {	//반복문
			System.out.println("이름: " + students[i].stuName + " 나이: " + students[i].stuAge + "세 성적: " + students[i].stuGrade + "점");
		}
		
		for (Student student : students) {	//foreach
			System.out.println("이름: " + student.stuName + " 나이: " + student.stuAge + "세 성적: " + student.stuGrade + "점");
		}
	}
}
