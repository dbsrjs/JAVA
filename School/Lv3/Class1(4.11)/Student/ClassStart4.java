package Class1;

public class ClassStart4 {

	public static void main(String[] args) {
		Student stu1 = new Student(); //메모리에 학생클래스를 생성하여 stu1에 담아둔다.		
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2 = new Student();
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
		
		Student[] students = new Student[2];
		students[0] = stu1;
		students[1] = stu2;
		
		System.out.println(students[0].stuName);
	}
}
/*
 * System.out.println(students[0].stuName);	배열 접근 시작
 * System.out.println(005[0].stuName);	[0]을 사용해서 005 배열의 0번 요소에 접근
 * System.out.println(001.stuName);	.(dot)을 사용해서  참조값으로 객체에 접근
 * System.out.println("홍길동");
 */
