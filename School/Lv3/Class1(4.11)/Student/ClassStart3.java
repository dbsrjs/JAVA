package Class1;

public class ClassStart3 {

	public static void main(String[] args) {
		Student stu1 = new Student(); //메모리에 학생클래스를 생성하여 stu1에 담아둔다.		
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2 = new Student();
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
		
		System.out.println("이름: " + stu1.stuName + " 나이: " + stu1.stuAge + "세 성적: " + stu1.stuGrade + "점");
		System.out.println("이름: " + stu2.stuName + " 나이: " + stu2.stuAge + "세 성적: " + stu2.stuGrade + "점");
	}
}
