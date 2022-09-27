import java.util.*;
public class Magicsquare {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[][]=new int[n][n];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            ar[i][j]=sc.nextInt();
        }
       int p= magic(ar);
       if(p!=-1)
       System.out.println("Magicsquare");
       else
       System.out.println("Not Magicsquare");


    }
    public static int magic(int ar[][])
    {
        int sum1=0,sum2=0;
        for(int i=0;i<ar.length;i++)
        {
            sum1+=ar[i][i];
            sum2+=ar[i][ar.length-1-i];
        }
        if(sum1!=sum2)
        return -1;
        for(int i=0;i<ar.length;i++)
        {
            int c=0,r=0;
            for(int j=0;j<ar.length;j++)
            {
                r+=ar[i][j];
                c+=ar[j][i];
            }
        
        if(r!=c)
        return -1;
        }
        return 0;
    }
    
}
