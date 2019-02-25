#include<stdio.h>

int main(){

    int n=5,sum=0,i;
    for(i=1;i<=n;i=i+3){

        printf("%d ",i);
        sum=sum+i;
    }
    printf("Sum : %d\n",sum);
    return 0;

}
