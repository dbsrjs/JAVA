package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자를 직접 하나라도 만든 경우에는 더 이상 자바가 기본생성자를 만들어주지 않는다.
    //따라서 기본생성자가 필요할 경우 직접 작성해야 한다.
    MemberConstruct(String name, int age) { //생성자는 한정자가 없다면 클래스에 한정자를 따른다.
        /*this.name = name;
        this.age = age;
        this.grade = 50;*/

        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) { //생성자는 한정자가 없다면 클래스에 한정자를 따른다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
