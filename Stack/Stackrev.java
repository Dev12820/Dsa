public class Stackrev {
        static char s[]=new char[10];
        static char dat[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        static int top=0;
        static int r;
        static char ch;
        public static void main(String args[]) {
            
            String a="1111";
            int c=0;
            for(int i=0;i<a.length();i++)
            {
                push(a.charAt(i));
            }
            while(top>=0)
            {
                pop();
            }
            
        }
            static void push(char x)
            {
                s[top++]=x;
            }
            static void pop()
            {
                char x=s[top--];
                System.out.print(x+" ");
            }
            
        }
