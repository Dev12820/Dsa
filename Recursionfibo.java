import java.util.*;
import java.lang.Math;
public class Recursionfibo {
    static long   DAT[]=new long[101];
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(int i=1;i<=100;i++)
        System.out.println(Math.abs(fibo(i)));
        System.out.println();
    }
    public static long fibo(int n)
    {
      if(n==1||n==2)
        return DAT[n]=n-1;
        else
        {
        if(DAT[n]==0)
        DAT[n]=(fibo(n-1)+fibo(n-2));
       }
       return DAT[n];
   }   
+    
}