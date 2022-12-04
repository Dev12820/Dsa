#include<stdio.h>
int main()
    {
            int m,n;
    int arr[10],brr[10],crr[20];
    int i=0,j=0,k=0,tmp,pm;
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
    printf("\nEnter array 2");
        
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
                        i++;
                            
                           else if(brr[j]<arr[i])
                           j++;
                           else
                           {
                           crr[k++]=arr[i++];
                           j++;
                           }
                        
                            
                    }
                    printf("\nThe Intersection of two arrays is ");
                            for(int z=0;z<k;z++)
                            printf("%d ",crr[z]);
                        }