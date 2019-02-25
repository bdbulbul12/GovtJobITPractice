#include<stdio.h>

int main(){

    int n=5, i,j,sum,totalSum=0;

    for(i=1;i<=n;i++){
        sum=0;
        for(j=1;j<=i;j++){
            sum=sum+j;
        }
        totalSum=totalSum+sum;

    }
    printf("Sum is : %d\n",totalSum);
    return 0;
}

