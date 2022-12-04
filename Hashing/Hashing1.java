import java.util.*;
public class Hashing1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        hash(ar);
    }
    public static void hash(int ar[])
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<ar.length;i++)
        {
        Integer c=hm.get(ar[i]);
        if(hm.get(ar[i])==null)
        hm.put(ar[i], 1);
        else 
        hm.put(ar[i],++c);
        }
        System.out.println(hm);
    }
    
}
