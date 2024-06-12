package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //부모는 자식 메서드를 참조할 수 없다.
        //dog.soung();  //컴파일 오류, Object에서 sound()가 없다.
        //car.move();   //컴파일 오류, Object에서 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog) {         //obj를 Dog에 dog(변수명)로 다운캐스팅
            dog.sound();
        } else if(obj instanceof Car car) {  //obj룰 Car에 car(변수명)로 다운캐스팅ㄴ
            car.move();
        }
    }
}
