import java.util.*;
import java.lang.*;
public class Validparenthesis {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();
        int i=0;
        if(s.charAt(0)==')')
        System.out.println("NO");
        else
        {
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                i++;
                System.out.println(i);
            }
            else if(s.charAt(i)==')')
            {
                System.out.println(i+","+s.substring(0,i-1)+","+s.substring(i+1, s.length()));
                s=s.substring(0,i-1)+s.substring(i+1, s.length());
                if(i<0) 
                i=0;
                else 
                i--;
            }
        }
        if(s.length()==0)
        System.out.println("YES");
        else 
        System.out.println("NO");
    }
    }
}

