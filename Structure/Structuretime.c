#include<stdio.h>

struct Time
{
    int hour,minute,second;
};
int main()
{
    struct Time t1,t2,t3;
    printf("Enter the time 1");
    scanf("%d%d%d",&t1.hour,&t1.minute,&t1.second);
    printf("Enter the time 2");
    scanf("%d%d%d",&t2.hour,&t2.minute,&t2.second);
    t3.hour=t1.hour+t2.hour+(t1.minute+t2.minute+(t1.second+t2.second)/60)/60;
	t3.minute=(t1.minute+t2.minute+(t1.second+t2.second)/60)%60;
	t3.second=(t1.second+t2.second)%60;
	printf("\n Time 1 %d : %d : %d",t1.hour,t1.minute,t1.second);
	printf("\n Time 2 %d : %d : %d",t2.hour,t2.minute,t2.second);
	printf("\n Time 3 %d : %d : %d",t3.hour,t3.minute,t3.second);
	return 0;

}