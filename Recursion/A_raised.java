import java.util.*;
public class A_raised {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int p=sc.nextInt();
      System.out.print( power(n,p));
   }
   public static int power(int n,int p)
   {
       if(p!=0)
       return(n*power(n,p-1));
       else
       return 1;
   }
   
}