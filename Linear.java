import java.util.*;
public class Linear
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        int c=sc.nextInt();
      System.out.println(linearsearch(ar,c));
    }
    public static int linearsearch(int[]cd,int p)
    {
        for(int j=0;j<cd.length;j++)
        {
        if(cd[j]==p)
        return j;
    }
    return -1;
}
}