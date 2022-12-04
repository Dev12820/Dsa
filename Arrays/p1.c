#include<stdio.h>
int main()
{
    int m,n;
    int arr[10],brr[10],crr[20];
    int i=0,j=0,k=0;
    printf("Devansh Singh");
    printf("\n2100320100061");
    printf("\nEnter the size of First Array");
    scanf("%d",&m);
     printf("\nEnter the size of Second Array");
    scanf("%d",&n);
    printf("\nEnter array 1");
        for(int i=0;i<m;i++)
            {
               scanf("%d",&arr[i]);
            }
            printf("\nEnter array 2");
                for(int j=0;j<n;j++)
                {
                    scanf("%d",&brr[j]);
                }
                    
                    while(i<m&&j<n)
                    {
                        if(arr[i]<brr[j])
                        
                            crr[k++]=arr[i++];
                           else if(brr[j]<arr[i])
                           crr[k++]=brr[j++];
                           else
                           {
                           crr[k++]=arr[i++];
                           j++;
                           }
                        
                            
                    }
                        while(i<m)
                        {
                            crr[k]=arr[i];
                            k=k+1;
                            i=i+1;
                        }
                            while(j<n)
                            {
                                crr[k]=brr[j];
                                k=k+1;
                                j=j+1;
                            }
                            printf("\nThe union of two arrays is ");
                            for(int z=0;z<k;z++)
                            printf("%d ",crr[z]);
}