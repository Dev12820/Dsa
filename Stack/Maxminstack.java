import java.util.*;
import java.util.Stack;
public class Maxminstack{
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            st.push(a);
        }
        int mm=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        while(!st.isEmpty())
        {
            int c=st.pop();
            m=Math.max(m,c);
            mm=Math.min(mm,c);
        }
        System.out.println(m);
        System.out.println(mm);


    }
}