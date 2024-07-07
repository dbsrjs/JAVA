package magicNumber.after2;

public class Robot {
    //걷기, 멈추기, 점프
    private String name;

    public enum Command {
        WALK,
        STOP,
        JUMP,
    };

    public Robot(String name) {
        this.name = name;
    }

    public void order(Robot.Command command) {
        if(command == Command.WALK) {
            System.out.println(name + " walk");
        } else if (command == Command.STOP) {
            System.out.println(name + " stop");
        } else if (command == Command.JUMP) {
            System.out.println(name + " jump");
        } else {
            System.out.println(name + " error");
        }
    }
}
