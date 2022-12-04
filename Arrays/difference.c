#include<stdio.h>
int main()
    {
            int m,n;
    int arr[10],brr[10],crr[20];
    int i=0,j=0,k=0,tmp,pm;
    printf("Devansh Singh");
    printf("\n2100320100061");
    printf("\nEnter the size of first set");
    scanf("%d",&m);
     printf("\nEnter the size of Second set");
    scanf("%d",&n);
    printf("\nEnter set 1");
            for(int i=0;i<m;i++)
            {
                scanf("%d",&arr[i]);
            }
            for(int i=0; i<m; i++)
    {
        for(int j=i+1; j<m; j++)
        {
            if(arr[j] <arr[i])
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
         printf("\nEnter set 2");
                for(int j=0;j<n;j++)
                {
                    scanf("%d",&brr[j]);
                }
                for( int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(brr[j] <brr[i])
            {
                pm = brr[i];
                brr[i] = brr[j];
                brr[j] = pm;
            }
        }
    }
                     while(i<m&&j<n)
                    {
                        if(arr[i]<brr[j])
                        
                            crr[k++]=arr[i++];
                           else if(brr[j]<arr[i])
                           j++;
                           else
                           {
                           i++;
                           j++;
                           }
                        
                            
                    }
                        while(i<m)
                        {
                            crr[k]=arr[i];
                            k=k+1;
                            i=i+1;
                        }
                        printf("\nThe Difference of two set is ");
                            for(int z=0;z<k;z++)
                            printf("%d ",crr[z]);
                        }