import java.util.*;
public class Recursionsum {
    
        
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ans=0;
        System.out.print(sum(n,ans));

    }
    public static int sum(int n,int ans)
    {
        return n==0? ans: sum(n/10,ans+n%10);
    }
}