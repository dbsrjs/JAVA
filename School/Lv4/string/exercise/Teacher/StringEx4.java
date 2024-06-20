package lang.string.test.teacher;

import java.util.Scanner;

public class StringEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine(); //어디서?
        String word = sc.nextLine();//어떤 문자를?
        int startIdx = 0;
        int cnt = 0;

        while(true) {
            //indexOf() : 특정 문자나 문자열이 앞에서부터 처음 발견되는
                //인덱스를 반환하며 만악 찾지 못했으면 -1을 반환한다.
            int findIdx = doc.indexOf(word, startIdx);
            if(findIdx < 0) {
                break;
            }

            startIdx = findIdx + word.length();
            cnt++;

            System.out.println(cnt);
        }
    }
}
