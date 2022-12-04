import java.util.*;
import java.util.Stack;
public class Sortstack {
    public static void main(String[] args) {
        Stack<Integer>str=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            str.push(a);
        }
        System.out.print(sort(str));
    }
    public static Stack<Integer> sort (Stack<Integer> str)
    {
        Stack<Integer>s=new Stack<Integer>();
        while(!str.isEmpty())
        {
            int a=str.pop();
            while(!s.isEmpty()&&s.peek()>a)
            {
                str.push(s.pop());
            }
            s.push(a);
        }
        return s;



    }
}
