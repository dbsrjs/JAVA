package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //기본 생성자 - 개발자가 생성자를 만들지 않을 경우에는
    //자바가 직접 만들어 준다.
    public MemberInit() {}
    
    public void initMember(String _name, int _age, int _grade) {
        this.name = _name;
        this.age = _age;
        this.grade = _grade;
    }
}
