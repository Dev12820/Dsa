import java.util.*;
public class Tailfactorial {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int f=1;
        System.out.println(fact(n,f));
    }
    public static int fact(int n,int f)
    {
        if(n==1)
        return f;
        return fact(n-1,n*f);
    }
    
}
