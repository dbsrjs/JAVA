package magicNumber.after;

public class Robot {
    //걷기, 멈추기, 점프
    private String name;

    public static final int COMMAND_WALK = 0;   //상수의 변수명은 모두 대문자 + 스네이크형
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {
        if(command == COMMAND_WALK) {
            System.out.println(name + " walk");
        } else if (command == COMMAND_STOP) {
            System.out.println(name + " stop");
        } else if (command == COMMAND_JUMP) {
            System.out.println(name + " jump");
        } else {
            System.out.println(name + " error");
        }
    }
}
