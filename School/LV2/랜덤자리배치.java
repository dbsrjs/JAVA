package dsf324;
import java.util.Random;
import java.util.Scanner;

public class sdf 
{
	public static void main(String[] args) 
	{
		//C#½Ä µé¿©¾²±â
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("°¡·Î");
		int rows = sc.nextInt();
		
		System.out.println("¼¼·Î");
		int cols = sc.nextInt();
		
		int[][] set = new int [rows][cols];
		
		for(int i=0; i<set.length; i++) 
		{
			for(int j=0; j<set[rows-1].length; j++) 
			{
				set[i][j] = rd.nextInt(rows*cols)+1;
				for(int k=0; k<=i; k++) 
				{
					for(int l=0; l<=cols; l++) 
					{
						if(i == k && j == l)
							continue;
						
						else if(set[i][j] == set[k][l])
							j--;
					}
				}
			}
		}
		
		
	}
}
