import java.util.*;
public class Recursionreverse {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        reverse(n);
    }
    public static int reverse(int n)
    {
        if(n<10)
        {
        System.out.print(n);
        return 0;
        }
        else
        {
            System.out.print(n%10);
            return reverse(n/10);
        }

   }
    
}
