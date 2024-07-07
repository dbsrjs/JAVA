package poly.ex06;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("날아요");
    }
    
    @Override
    public void sound() {
        System.out.println("짹짹");
    }
}
