package lang.string.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;//제거해야할 문자
        String str1 = sc.next();
        String str2 = sc.next();

        for (int i = 0; i < str1.length(); i++) {
            String s = str1.substring(i, i + 1);
            int eq = 0;
            for (int j = 0; j < str2.length(); j++) {
                String n = str2.substring(j, j + 1);

                if(n.equals(s))//같다면
                    eq++;
            }
            if(eq <= 0)//같은게 하나라도 없다면
                num++;
        }

        for (int i = 0; i < str2.length(); i++) {
            String s = str2.substring(i, i + 1);
            int eq = 0;
            for (int j = 0; j < str1.length(); j++) {
                String n = str1.substring(j, j + 1);

                if(n.equals(s))//같다면
                    eq++;
            }
            if(eq <= 0)//같은게 하나라도 없다면
                num++;
        }

        System.out.println(num);
    }
}
