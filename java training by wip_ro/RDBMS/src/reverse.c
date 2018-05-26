#include<stdio.h>
#include<string.h>
void main()
{
char a[50];
gets(a);
int i=0,j=strlen(a)-1,temp;
for(i=0;i<strlen(a)/2;i++)
{
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    j--;
}
puts(a);
}
