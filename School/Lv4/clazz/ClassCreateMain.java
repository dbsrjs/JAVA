package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        //getDeclaredConstructor() : 생성자를 선택
        //newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성한다.
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
/*
리플액션 - reflection
Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이를 통해
객체 인스턴스를 생성하거나 메서드를 호출하는 작업을 할 수 있다.
이런 작업을 리플액션이라고 한다.
 */
