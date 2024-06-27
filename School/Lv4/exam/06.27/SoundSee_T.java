package Exam.ex0627;

import java.util.*;

public class SoundSee_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//듣
        int M = sc.nextInt();//보

        Set<String> nogear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nogear.add(sc.next());//듣지 못하는 사람의 이름을 hashset에 추가
        }

        //듣지도, 보지도 못하는 사람들의 이름을 List에 저장
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if(nogear.contains(name)) {//입력 받은 이름이 set에 있는지 확인
                ans.add(name);//set에 이름이 있으면 이는 돋보잡이다.
            }
        }

        //이름 리스트를 오름차순으로 정렬
        Collections.sort(ans);

        System.out.println(ans.size());

        for (String name : ans) {
            System.out.println(name);
        }
    }
}
