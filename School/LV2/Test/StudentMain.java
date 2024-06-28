package JAVATEST;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> info = new ArrayList<>();    //0부터 시작
        info.add(new Student(3, "김회장", "여", "010-1234-1234"));
        info.add(new Student(3, "이총무", "남", "010-1234-5678"));
        info.add(new Student(2, "유부장", "남", "010-5678-5678"));
        info.add(new Student(1, "최신입", "여"));

        System.out.println("2023학년도 학생현황");
        for (Student student : info) {
            student.StudentInfo();
        }

        for (Student student : info) {
            student.UpGrade();
        }

        for (int i = 0; i < 4; i ++) {
            if (info.get(0).getGrade() >= 4) {
                info.remove(0);
            }
        }

        System.out.println("2024학년도 학생현황");
        for (Student student : info) {
            student.StudentInfo();
        }
    }
}
