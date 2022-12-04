import java.util.*;

public class Linearprobling {
     

    public static void main(String[] args) {
         hashing();
        
         
    }

   // public static int hash(int key) {
   //     return key % 7;
   // }

    public static void hashing() {
 int ar[]=new int[7];
 int key[]=new int[7];
 int t;
 int f=0;
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
          for(int j=0;j<p;j++)
          {
               key[j] =sc.nextInt();
          }
               for(int i =0;i<p;i++)
          {
               //int key = sc.nextInt();
        int ind = key[i]%7;
        System.out.println("Hell"+i);
         t = ind;
        if(ar[t]==0)
        ar[t]=key[i];
        else
        {
            while(true)
            {
                if(t>=7)
                t=t-7;
                if(ar[t]==0)
                {
                    ar[t]=key[i];
                    f=1;
                    break;
                }
                t++;
            }
            if(f==1)
            break;
        }
    }
    System.out.println(Arrays.toString(ar));
}
}
        
        
        
        
        
        
        
//          while (ar[ind] != 0) {
//             if (ar[ind]==0)
//                 {
//                    ar[ind]=key[i];
//                 }
//                 else
//                 ind = (ind + 1)%7;
//         }
//         ar[ind] = key[i];
//         System.out.println("Hello");
//     }
//     for(int g=0;g<7;g++)
//     System.out.println(ar[g]);
//     }

// }
