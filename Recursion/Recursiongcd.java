import java.util.*;
public class Recursiongcd {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int o=gcd(m,n);
        System.out.println(o);
        System.out.print(lcm(o,m,n));
    }
    public static int gcd(int m,int n)
    {
        if(m%n==0)
        return n;
        return gcd(n,m%n);
    }
    public static int lcm(int o,int m,int n)
    {
        return (m*n)/o;
    }
}
