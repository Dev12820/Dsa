import java.util.*;
import java.util.Stack;
public class Postfix {
    static int s[]=new int[10];
    static int top=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int j=pfev(st);
        System.out.print(j);

        
    }
    //static void push(int x)
    //        {
    //            s[top++]=x;
    //        }
    //        static int pop()
    //        {
    //            
    //            int x=s[top--];
    //            return x;
    //           
    //        }
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
                 public static int  pfev(String st)
                {
                    Stack<Integer> str = new Stack<Integer>();
                    int p;
                    

                    for(int i =0 ;i<st.length();i++)

            {       
                char x = st.charAt(i);
                    if(x >= '0' && x<='9')
                    {
                        str.push(x-'0');
                    }
                    else {
                     int b=str.pop();
                     int a=str.pop();
                     
                     p= eval(b,a,x);
                     str.push(p);
                        
                    }
                }
                    p = str.pop();
                    return p;
                }
            }
