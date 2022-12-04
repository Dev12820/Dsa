import java.util.*;
public class Multistack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>str=new Stack<Integer>();
        Stack<Integer>st=new Stack<Integer>();
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        for(int j=ar.length-1;j>(ar.length-1)/2;j--)
        str.push(ar[j]);
        for(int k=(ar.length-1)/2;k>=0;k--)
        st.push(ar[k]);
        PrintStack(str);
        System.out.println("");
        Prints(st);



    }
    public static void PrintStack(Stack<Integer> s)
{
  Stack<Integer> temp = new Stack<Integer>();
   
  while (s.empty() == false)
  {
    temp.push(s.peek());
    s.pop();
  }  
 
  while (temp.empty() == false)
  {
    int t = temp.peek();
    System.out.print(t + " ");
    temp.pop();
    s.push(t); 
  }
}
 
public static void Prints(Stack<Integer> s)
{
  Stack<Integer> temp = new Stack<Integer>();
   
  while (s.empty() == false)
  {
    temp.push(s.peek());
    s.pop();
  }  
 
  while (temp.empty() == false)
  {
    int t = temp.peek();
    System.out.print(t + " ");
    temp.pop();
    s.push(t); 
  }
}
 
    
}
