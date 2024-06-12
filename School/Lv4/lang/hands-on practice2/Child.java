package lang.object;

// 명시적 상속
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}

/*
클래스에 상속 받을 부모 클래스를 명시적으로 지정하면 Object를 상속 받지 않음.
 */
