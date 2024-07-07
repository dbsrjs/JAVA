package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child)  {  //instanceof 뒤에 있는 것을 참조 하는지 안 하는지 반환
            System.out.println("Child 인스턴스 맞음");
            ((Child)parent).childMethod();
        }
    }
}
/*
지금처럼 다운케스팅을 수행하기 전에 먼저 instanceof를 사용해서
원하는 타입으로 변경이 가능한지 확한 다음에 다운케스팅을
수행하는 것이 안전하다.
참고로 instanceof 키워드는 오른쪽 대상의 자식 타입을 왼쪽에
첨조하는 경우에도 true룰 반환한다.

parent instanceof Parent
new Parent() instanceof Parent : true
new Child instanceof Parent : true
 */
