#include<stdio.h>
struct details
{
    char name[20],add[20];
    int roll,marks,age;

};
int main()
{
    struct details s[15];
    for(int i=0;i<15;i++)
    {
    scanf("%s%d%d",s[i].name,s[i].age,&s[i].roll,&s[i].marks,s[i].add);
    }
    for(int i=0;i<15;i++)
    {
        printf("%s%d%d%d%s",s[i].age,s[i].roll,s[i].marks,s[i].add);
    }

}