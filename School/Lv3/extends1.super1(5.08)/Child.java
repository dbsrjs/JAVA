package extends1.super1;

public class Child  extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("자식의 값: " + this.value); //this는 생략해도 되지만 가독성을 위해 사용.
        System.out.println("부모의 값: " + super.value);

        this.hello();//this는 생략 가능.
        super.hello();
    }
}
