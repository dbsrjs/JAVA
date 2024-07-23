package review.extend;

public class HamBurger {
    public String name;

    public HamBurger() {
        this.name = "햄버거";
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(name+"를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}
