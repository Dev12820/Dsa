import java.util.*;
import java.math.*;
public class Expo extends Binary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        Arrays.sort(ar);
        int c=sc.nextInt();
        
      int p=exposearch(ar,ar.length,c);
      System.out.print(p);
    }
    public static int exposearch(int cd[],int n,int c)
    {
        if(cd[0]==c)
        return 0;
        int i=1;
        while(i<c&&cd[i]<=c)
        i=i*2;
        return binarysearch(cd,i/2,Math.min(i,n-1),c);

    }
    
    
}
