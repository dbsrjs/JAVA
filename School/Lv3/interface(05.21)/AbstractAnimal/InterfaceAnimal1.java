package poly.interface1;

//인터페이스
//인터페이스의 메서드는 public, abstract 를 무조건 사용한다.
//그래서 생략이 가능하다.
public interface InterfaceAnimal1 {
    void sound();
    void move();

    public static final double MY_PI = 3.14;
    double YOU_PI = 3.14;
}

//인터페이스에서 멤버 변수는 public static final 이 모두 포함되었다고 간주한다.
//final은 변수 값을 한 번 설정하면 수정할 수 없다는 뜻이다.(상수)
//자바에서 static final을 사용해 정적이면서 고칠 수 없는 변수를 상수라고 하고, 관례상 상수는 대문자에 언더바(_)로 구분한다.
//해당 키워드는 생략이 가능하다. (생략 권장)

