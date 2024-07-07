package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(solution(arr, target));
    }

    public static boolean solution(int[] arr, int target) { //HashSet
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : arr) {
            if (set.contains(target -= i)) {   //set에 target -= i가 포함되어 있다면 contains : 값이 있는지 확인.
                return true;
            }
            set.add(i);
        }
        return false;
    }

    /*static boolean solution(int[] arr, int target) {  //Array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = num; j < arr.length; j++) {
                *if (num == arr[j]) {
                    continue;
                }
                if (target == num + arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }*/
