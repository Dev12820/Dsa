#include<stdio.h>
int main()
    {
            int m,n;
    int arr[10],brr[10],crr[20];
    int i=0,j=0,k=0;
    scanf("%d",&m);
    scanf("%d",&n);
            for(int i=0;i<m;i++)
            {
                scanf("%d",&arr[i]);
            }
                for(int j=0;j<n;j++)
                {
                    scanf("%d",&brr[j]);
                }
                    while(i<m&&j<n)
                    {
                        if(arr[i]<brr[j])
                        i++;
                            
                           else if(brr[j]<arr[i])
                           j++;
                           else
                           {
                           crr[k++]=arr[i++];
                           j++;
                           }
                        
                            
                    }
                    if(k==0)
                    printf("0");
                        else
                            for(int z=0;z<k;z++)
                            printf("%d",crr[z]);
                        }
    

