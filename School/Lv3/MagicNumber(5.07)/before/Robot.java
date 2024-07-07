package magicNumber.before;

public class Robot {
    //걷기, 멈추기, 점프
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {
        if(command == 0) {
            System.out.println(name + " walk");
        } else if (command == 1) {
            System.out.println(name + " stop");
        } else if (command == 2) {
            System.out.println(name + " jump");
        } else {
            System.out.println(name + " error");
        }
    }
}
