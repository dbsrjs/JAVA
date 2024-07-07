package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw};

        for (int i = 0; i < animals.length; i++) {
            System.out.println("동물 소리 테스트 시작");
            animals[i].sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
