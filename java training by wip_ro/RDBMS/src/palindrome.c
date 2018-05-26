#include<stdio.h>
#include<string.h>
void main()
{
char a[50];
gets(a);
int i=0,j=strlen(a)-1;
int flag=1;
while(i<=j)
{
if(a[i]==a[j])
{
   i++;
   j--;
}
else
{
    flag=0;
    break;
}
}
if(flag==1)
printf("pal");
else
printf("not pal");
}
