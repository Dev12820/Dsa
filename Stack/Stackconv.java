public class Stacknum {
        static int s[]=new int[10];
        static char dat[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        static int top=0;
        static int r;
        static char ch;
        public static void main(String args[]) {
            
            int a=21;
            while(a>0)
            {
                r=a%8;              //divide the no in whuch u have to cnvert
                push(r);
                a/=8;               //divide the no in whuch u have to cnvert
            }
            while(top>=0)
            {
                pop();
    
            }
        }
            static void push(int x)
            {
                s[top++]=x;
            }
            static void pop()
            {
                int x=s[top--];
                System.out.println(dat[x]);
            }
        }
