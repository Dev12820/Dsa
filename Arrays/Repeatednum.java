import java.util.*;
public class Repeatednum {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int max=a[0];
        for(int i=1;i<n;i++)
        if(a[i]>max)
        max=a[i];
        int dat[]=new int[max+1];
        for(int i=0;i<n;i++)
        dat[i]=0;
        for(int i=0;i<n;i++)
        dat[a[i]]++;
        for(int i=0;i<max;i++)
        if(dat[i]>1)
        System.out.println(i);


    }
    
}
