package lang.string.test.teacher;

import java.util.Scanner;

public class StringEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] current = sc.next().split(":");
        String[] target = sc.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinute = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        //현재 시간
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
        //목표 시간
        int targetSecondAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;

        //현재 시간으로부터 목표시간까지의 필요한 시간
        int needSecondAmount = targetSecondAmount - currentSecondAmount;
        if(needSecondAmount <= 0) needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
