#include<stdio.h>
int stack[]=new int[10];
int top=0;
struct student
 {
    int a;
 }s;
 void main()
 {
    while(s.a>0)
    {
        int r=s.a%2;
        if(top<stack.length)
        {
             stack[top++]=x;
        }
        s.a/=2;
    }
    while(top>=0)
    {
        int x=stack[--top];
        printtf("%d",x);
    }
 }
}
