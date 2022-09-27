import java.util.*;


public class Trans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int ar[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
        ar[i][j]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
            if(i<j)
            {
            ar[i][j]=ar[i][j]+ar[j][i];
            ar[j][i]=ar[i][j]-ar[j][i];   
            ar[i][j]=ar[i][j]-ar[j][i];
            }

            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            System.out.print(ar[i][j]+" ");
            System.out.println();

        }
    }
    
}
