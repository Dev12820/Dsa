import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        int temp=0,flag=1;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(ar[j-1] > ar[j]){   
                            temp = ar[j-1];  
                            ar[j-1] = ar[j];  
                            ar[j] = temp;
                    flag=1;
                }
            }
        }
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
}
}
