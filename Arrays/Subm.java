import java.util.*;
public class Subm
 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
    int a,b,c,d;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    if(a==c&&b==d)
    {
    int ar[][]=new int[a][b];
    int br[][]=new int[c][d];
    int cr[][]=new int[a][b];
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
    ar[i][j]=sc.nextInt();
    }
    for(int i=0;i<c;i++)
    {
        for(int j=0;j<d;j++)
    br[i][j]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
    cr[i][j]=ar[i][j]-br[i][j];
    }
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
        System.out.print(cr[i][j]+" ");
        System.out.println(); 
    }
}
    else
    System.out.println("Not a suitable Matrix");
}
}
