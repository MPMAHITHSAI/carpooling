package carpoling;

import java.util.Scanner;

public class carpooling{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] carsp= new int[m][n];
        int memb=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                carsp[i][j]= sc.nextInt();
            }
            memb+=carsp[i][0];
        }
        int space = sc.nextInt();
        int count=0;
        if(memb==space)
        {
            for(int i=0;i<m;i++)
            {
                if(carsp[i][1]<carsp[i][2])
                {
                    count++;
                }
            }
            if(count==m)
            {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else {
        	System.out.println(false);
            return;
        }

    
	}
	
}