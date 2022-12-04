import java.util.*;
import java.util.Stack;
public class Infi_to_pos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String c=ifpf(st); 
        System.out.println(c);   
    }
    public static String ifpf(String str )
    {
        Stack<Character> st = new Stack<Character>();
    String postfix = "";
    char ch[] = str.toCharArray();
    for(int i =0 ;i<str.length();i++)
            {       
                char x = str.charAt(i);
                    if(x >= '0' && x<='9')
                    {
                        postfix+=x;
                    }
                    else if (x == '(') {
                        st.push(x);
                      } else if (x == ')') {
                        while(!st.isEmpty()) {
                          char t = st.pop();
                          if(t != '(') {
                            postfix = postfix + t;
                          } 
                          else {
                            break;
                          }
                        }
                    }
else if(x == '+' ||x == '-' ||x== '*' ||x == '/'||x=='%') {
    if(st.isEmpty()) {
      st.push(x);
    }
     else {
      while(!st.isEmpty()) {
        char t = st.pop();
        if(t == '(') {
          st.push(t);
          break;
    }
    else if(t == '+' || t == '-' || t == '*' || t == '/') {
        if(getPriority(t) <  getPriority(x)) {
          st.push(t);
          break;
        } else {
          postfix = postfix + t;
}
}
    }
    st.push(x);
}
    }
}
while(!st.isEmpty()) {
    postfix = postfix + st.pop();
  }
  return postfix;
}
public static int getPriority(char c) {
    if(c == '+' || c == '-') {
      return 1;
    } else {
      return 2;
    } 
  }
  
}
