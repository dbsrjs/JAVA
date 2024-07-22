package Exam.ex0722;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Yosepus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }

        int[] ans = new int[n];
        for(int i = 0; i<n; i++) {
            for(int j = 1; j<k; j++) {
                q.add(q.poll());
            }
            ans[i] = q.poll();
        }

        System.out.print("<");
        for(int i = 0; i < ans.length; i++) {
            if(i == ans.length - 1) System.out.print(ans[i]);
            else System.out.print(ans[i] + ", ");
        }
        System.out.print(">");

        System.out.println();

        //System.out.println("<" + Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + ">");
    }
}
