package JAVATEST;

public class Student {
        private int grade; // 학년
        private String name;    //이름
        private String gender;  //성별
        private String phone;   //전화번호


    public Student(int grade, String name, String gender, String phone) {   //폰 있
        this.grade = grade;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(int grade, String name, String gender) { //폰 없
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 3) {
            this.grade = grade;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void StudentInfo()
    {
        if (phone == null) {
            System.out.println(name+"학생은 "+grade+"학년이며, 성별은 "+gender+", 전화번호는 "+"없음입니다.");
        } else {
            System.out.println(name+"학생은 "+grade+"학년이며, 성별은 "+gender+", 전화번호는 "+phone+"입니다.");
        }
    }

    public void UpGrade()
    {
        grade++;
    }
}
