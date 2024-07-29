import java.util.Random;
import java.util.Scanner;

public class dbsrjs
{
	public static void main(String[] args) 
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);		
	       
        int 정 = rd.nextInt(9)+1;
        int 연 = rd.nextInt(9)+1;
        int 택 = rd.nextInt(9)+1;
       
        while(정==연||연==택||택==정) 
        {
            정 = rd.nextInt(9)+1;
            연 = rd.nextInt(9)+1;
            택 = rd.nextInt(9)+1;
        }
        
        System.out.print("숫자 3개 입력해봐");
        int jyt = sc.nextInt();
       
        if(jyt>999) 
        {
            System.out.println("응 다시해~");
        }
        
        else 
        {
            int t = jyt % 10; // 3
            jyt = jyt / 10; // 12
            int y = jyt % 10; // 2
            jyt = jyt / 10; // 1
            int j = jyt % 10; // 1
           
            int s = 0;
            int b = 0;
            // 스트라이크 인지 볼인지 판단
            // 컴퓨터 : 정 연 택
            // 입력한 : j  y t
            if(정==j) s++;
            if(연==y) s++;
            if(택==t) s++;
            
            if(j == 연 || j == 택) b++;
            if(y == 정 || y == 택) b++;
            if(t == 정 || t == 연) b++;
        }
	}
}
