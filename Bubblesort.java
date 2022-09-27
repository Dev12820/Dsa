import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        int temp,flag=1;
        for(int i=0;i<ar.length;i++)
        {
            flag=0;
            for(int j=0;i<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j-1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag=1;
                }
            }
        }
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]);

    
}
}