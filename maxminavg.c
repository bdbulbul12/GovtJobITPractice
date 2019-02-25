#include<stdio.h>

int main(){

    int i,n,max,min,tot,sum;
    float avg;

    printf("Enter number of elements \n");
    scanf("%d",&tot);

    printf("Enter Number \n");
    scanf("%d",&n);

    max=n;
    min=n;
    sum=n;

    for(i=1;i<=tot-1;i++){

        scanf("%d",&n);
        if(n>max)
            max=n;
        else if (n<min)
            min=n;
        sum=sum+n;
    }
    printf("Largest %d",max);
    printf("Minimum %d",min);
    printf("Average %d",avg=sum/tot);
    return 0;
}
