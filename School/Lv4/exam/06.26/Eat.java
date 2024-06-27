package Me;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Eat {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Scanner보다 입력이 빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//출력이 더 빠름
        
        int testCast = Integer.parseInt(br.readLine());//테스트 케이스의 개수

        for (int a = 0; a < testCast; a++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());//공백을 기준으로 문자열을 짤라서 저장
        	
        	 int aCaseLength = Integer.parseInt(st.nextToken());
             int bCaseLength = Integer.parseInt(st.nextToken());

             int[] aCase = new int[aCaseLength];// case a
             int[] bCase = new int[bCaseLength];// case b

            st = new StringTokenizer(br.readLine());//nextToken이 없기 때문에 재정의해서 값을 다시 입력해줌
            for (int i = 0; i < aCase.length; i++) aCase[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());//nextToken이 없기 때문에 재정의해서 값을 다시 입력해줌
            for (int i = 0; i < bCase.length; i++) bCase[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(bCase);//bCase를 오름차순(1 -> 10)으로 정렬
            int result = 0;
        	//이해 필요
            for (int j = 0; j < aCaseLength; j++) {
                int first = 0;
                int end = bCaseLength - 1;
                int index = 0;

                while (first <= end) {
                    int mid = (first + end) / 2;
                    if (bCase[mid] < aCase[j]) {
                        first = mid + 1;
                        index = mid + 1;
                    }

                    else {
                        end = mid - 1;
                    }
                }

                result += index;
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
/*
for (int i = 0; i < aCase.length; i++) {
    for (int j = 0; j < bCase.length; j++) {
    	if(aCase[i] <= bCase[j])
    		continue;
    	
        if(aCase[i] > bCase[j])
            result[a]++;
    }
}
*/   
