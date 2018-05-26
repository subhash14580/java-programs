#include<stdio.h>
#include<conio.h>
 int max(int a,int b){

 return a>b?a:b;
 }

int findLen(char A[], int n, int k, char ch)
{
    int maxlen = 1;
    int cnt = 0;
    int l = 0, r = 0;

    // traverse the whole string
    while (r < n) {

        /* if character is not same as ch
           increase count */
        if (A[r] != ch)
            ++cnt;

        /* While  count > k  traverse the string
           again until count becomes less than k
           and decrease the count when characters
           are not same */
        while (cnt > k) {
            if (A[l] != ch)
                --cnt;
            ++l;
        }

        /* length of substring will be rightIndex -
           leftIndex + 1. Compare this with the maximum
           length and return maximum length */
        maxlen = max(maxlen, r - l + 1);
        ++r;
    }
    return maxlen;
}

// function which returns maximum length of substring
int answer(char a[], int n, int k)
{
    int maxlen = 1;

        maxlen = max(maxlen, findLen(a, n, k, '3'));
        maxlen = max(maxlen, findLen(a, n, k,'5'));

    return maxlen;
}

// Driver code
int main()
{
char a[1000];
scanf("%s",a);
printf("%d",answer(a,8,1));



    return 0;
}
