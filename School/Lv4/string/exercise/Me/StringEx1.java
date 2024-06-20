package lang.string.test.me;

import java.util.Scanner;

public class StringEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            if(s.equals(s.toUpperCase()))//s가 s의 대문자와 가다면
                System.out.print(s.toLowerCase());
            else
                System.out.print(s.toUpperCase());
        }
    }
}
