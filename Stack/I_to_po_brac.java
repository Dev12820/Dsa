import java.util.*;
import java.util.Stack;
public class I_to_po_brac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String j=ifpf(st);
        System.out.print(j);
    
}
static int eval(int a ,int b,char op)
            {
                switch(op)
                {
                    case '+':
                    return (a+b);
                    case '-':
                    return(a-b);
                    case '*':
                    return(a*b);
                    case '/':
                    return(a/b);
                    case '%':
                    return(a%b);
                }
                return -1;
            }
            public static String  ifpf(String st)
                {
                    String result = new String("");
                    Stack<Character> str = new Stack<Character>();
                    char p;
                    for(int i =0 ;i<st.length();i++)
                    {
                        char c = st.charAt(i);
                        if (Character.isLetterOrDigit(c))
                        result += c;
                        else if (c == '(')
                        str.push(c);
                        else if (c == ')') {
                            while (!str.isEmpty()
                                   && str.peek() != '(') {
                                result += str.peek();
                                str.pop();
                            }
              
                            str.pop();
                        }
                        else 
                        {
                            if(c >= '0' && c<='9')
                    {
                        str.push((char) (c-'0'));
                    }
                    else {
                     char b=str.pop();
                     char a=str.pop();
                     
                     p= (char) eval(b,a,c);
                     str.push( p);
                        
                    }
                        }
                    }
                    while (!str.isEmpty()) {
                        if (str.peek() == '(')
                            return "Invalid Expression";
                        result += str.peek();
                        str.pop();
                    }
                    return result;
                }
            }
