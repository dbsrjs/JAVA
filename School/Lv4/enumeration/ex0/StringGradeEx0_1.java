package enumeration.ex0;

import java.util.Scanner;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DisCountService disCountService = new DisCountService();

        int price = 10000;

        System.out.print("등급을 입력해주세요 : ");
        String lv = sc.next();

        System.out.println(disCountService.disCount(lv, price));
    }
}
