package generics.coffee;

import generics.user.User;
import generics.user.VIPUser;

public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(10);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------");

        CoffeeByName c3 = new CoffeeByName(11);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-----------------");

        //c3의 name은 Object 타입이기 때문에 int로 형변환 해줘야함
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("-----------------");

        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 :" + c5Name);

        Coffee<String> c6 = new Coffee<>("하하");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-----------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("노홍철"));
        c7.ready();

        CoffeeByUser<VIPUser> c8 = new CoffeeByUser<>(new VIPUser("정형돈"));
        c8.ready();

        System.out.println("-----------------");
        
        orderCoffee("홍길동");
        orderCoffee("장발장", "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    //다중 제네릭 타입 매개변수 메서드
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}