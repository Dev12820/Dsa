import java.util.*;
public class Charf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int d=ch.length;
        int dat[]=new int[26];
        for(int i=0;i<ch.length;i++)
        dat[i]=0;
        int i=0;
        
        while(d-->0)
        {
            dat[ch[i]-97]++;
            i++;
        }
        for(int j=0;j<26;j++)
        if(dat[j]>0)
        {
            int b=j+97;
            char c=(char)b;
        System.out.print(c);
        System.out.print(dat[j]);
        System.out.println("");


        }
        
    }
    
}
